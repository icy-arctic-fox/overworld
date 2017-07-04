import com.turtleboxgames.overworld.entities.*
import org.jetbrains.exposed.sql.*
import org.jetbrains.exposed.sql.transactions.transaction
import org.jetbrains.exposed.sql.SchemaUtils.create

fun foo(name: String) {
    Database.connect("jdbc:h2:~/Desktop/h2test", driver = "org.h2.Driver")
    System.out.println("Hello, " + name)
    transaction {
        logger.addLogger(StdOutSqlLogger)
        create(Games)
        val game = Game.new {
            this.name = "Test2"
            description = "Foobar"
        }
        System.out.println(game.description)
        commit()
    }
}
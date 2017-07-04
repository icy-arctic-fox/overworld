import com.turtleboxgames.overworld.base64
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
        for(game in Game.all()) {
            System.out.println("ID: ${game.id.value.base64()}, Name: ${game.name}, Desc: ${game.description}, Flag: ${game.enabled}")
        }
        commit()
    }
}
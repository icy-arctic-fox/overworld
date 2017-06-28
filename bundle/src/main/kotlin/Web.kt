import io.vertx.core.Vertx
import io.vertx.ext.web.Router

fun main(argv: Array<String>) {
    val vertx = Vertx.vertx()
    val server = vertx.createHttpServer()
    val mainRouter = Router.router(vertx)
    val apiRouter = APIRouter.create(vertx)
    mainRouter.mountSubRouter("/api", apiRouter)
    server.requestHandler { mainRouter.accept(it) }.listen(8080)
}
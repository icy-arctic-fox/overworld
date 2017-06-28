import io.vertx.core.Vertx
import io.vertx.ext.web.Router

object APIRouter {
    fun create(vertx: Vertx): Router {
        val router = Router.router(vertx)
        router.route().handler { rc -> rc.response().end("Hello world!") }
        return router
    }
}
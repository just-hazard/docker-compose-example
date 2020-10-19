package hello
import io.javalin.Javalin
import khttp.get
import java.util.*

fun main(args : Array<String>) {
    startWebServer()
}

private fun startWebServer() {
    val app = Javalin.create().start(8080)
    app.get("/test") { ctx -> ctx.result(get("http://host.docker.internal:1080/test").text) }
}




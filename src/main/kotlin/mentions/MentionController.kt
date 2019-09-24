package mentions

import io.micronaut.http.annotation.*
import io.reactivex.Maybe
import org.slf4j.LoggerFactory

@Controller("/mentions")
class MentionController {

    private val log = LoggerFactory.getLogger(MentionController::class.java)

    @Get("/")
    fun get(@QueryValue("hub.challenge") challenge: String): Maybe<Int> {
        log.info("get mentions")
        return Maybe.just(challenge.toInt())
    }

    @Post("/")
    fun create(@Body body: String): Maybe<String> {
        log.info("receive mention payload={}", body)
        return Maybe.just("created")
    }
}
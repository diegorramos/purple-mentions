package mentions

import io.micronaut.http.annotation.Body
import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Get
import io.micronaut.http.annotation.Post
import io.reactivex.Maybe
import org.slf4j.LoggerFactory

@Controller("/mentions")
class MentionController {

	private val log = LoggerFactory.getLogger(MentionController::class.java)

	@Get("/")
	fun get(): Maybe<String> {
		log.info("get mentions")
		return Maybe.just("success")
	}

	@Post("/")
	fun create(@Body body: String): Maybe<String> {
		log.info("receive mention payload={}", body)
		return Maybe.just("created")
	}
}
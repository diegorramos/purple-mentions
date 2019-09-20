package mentions

import io.micronaut.http.annotation.Body
import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Post

@Controller("/mentions")
class MentionController {

	@Post("/")
	fun create(@Body body: String) {

	}
}
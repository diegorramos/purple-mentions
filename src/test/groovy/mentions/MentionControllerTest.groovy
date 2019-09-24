package mentions

import io.micronaut.http.HttpRequest
import io.micronaut.http.client.RxHttpClient
import io.micronaut.http.client.annotation.Client
import io.micronaut.test.annotation.MicronautTest
import spock.lang.Specification

import javax.inject.Inject

@MicronautTest
class MentionControllerTest extends Specification {

    @Inject
    @Client('/mentions')
    RxHttpClient client

    def "should return int when call get mentions"() {
        when:
            Integer response = client
                    .toBlocking()
                    .retrieve(HttpRequest.GET('/?hub.mode=subscribe&hub.challenge=1945977589&hub.verify_token=hFtMwaeBfCrs22T8'), Integer)
        then:
            response == 1945977589
    }
}

package mentions

import io.micronaut.runtime.Micronaut

object Application {

    @JvmStatic
    fun main(args: Array<String>) {
        Micronaut.build()
                .packages("mentions")
                .mainClass(Application.javaClass)
                .start()
    }
}
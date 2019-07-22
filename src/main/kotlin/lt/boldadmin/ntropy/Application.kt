package lt.boldadmin.ntropy

import org.springframework.boot.autoconfigure.EnableAutoConfiguration
import org.springframework.boot.runApplication
import org.springframework.context.annotation.ImportResource
import org.springframework.scheduling.annotation.EnableScheduling

@EnableAutoConfiguration
@ImportResource("classpath:context/context.xml")
@EnableScheduling
class Application

fun main(args: Array<String>) {
    runApplication<Application>(*args)
}

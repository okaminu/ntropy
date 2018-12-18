package lt.boldadmin.ntropy

import org.springframework.boot.autoconfigure.EnableAutoConfiguration
import org.springframework.boot.runApplication
import org.springframework.context.annotation.ComponentScan
import org.springframework.context.annotation.FilterType
import org.springframework.scheduling.annotation.EnableScheduling

@EnableAutoConfiguration
@EnableScheduling
@ComponentScan(
        basePackages = ["lt.boldadmin.ntropy", "lt.boldadmin.nexus.backend.adapter.client"],
        includeFilters = [ComponentScan.Filter(
                type = FilterType.REGEX,
                pattern = ["lt.boldadmin.nexus.backend.adapter.client.*"]
        )]
)
class Application
fun main(args: Array<String>) {
    runApplication<Application>(*args)
}
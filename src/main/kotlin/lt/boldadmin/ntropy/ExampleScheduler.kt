package lt.boldadmin.ntropy

import lt.boldadmin.nexus.factory.CountryFactory
import org.springframework.scheduling.annotation.Scheduled
import org.springframework.stereotype.Component

@Component
class ExampleScheduler(private val countryFactory: CountryFactory) {

    @Scheduled(cron = "*/3 * * * * *")
    fun example() {
        val country = countryFactory.createWithDefaults()
        println(country.name)
    }
}
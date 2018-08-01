package lt.boldadmin.ntropy

import lt.boldadmin.nexus.service.LogoutService
import org.springframework.scheduling.annotation.Scheduled
import org.springframework.stereotype.Component

@Component
class LogoutScheduler(private val logoutService: LogoutService) {

    @Scheduled(cron = "*/3 * * * * *")
    fun schedule() {
        logoutService.logout()
    }
}
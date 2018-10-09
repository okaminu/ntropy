package lt.boldadmin.ntropy

import lt.boldadmin.nexus.service.worklog.status.WorkLogStartEndService
import org.springframework.scheduling.annotation.Scheduled
import org.springframework.stereotype.Component

@Component
class EndOfWorkScheduler(private val workLogStartEndService: WorkLogStartEndService) {

    @Scheduled(cron = "0 */10 * * * *")
    fun schedule() {
        workLogStartEndService.endAllStartedWorkWhereWorkTimeEnded()
    }

}
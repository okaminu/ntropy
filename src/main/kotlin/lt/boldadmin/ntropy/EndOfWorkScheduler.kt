package lt.boldadmin.ntropy

import lt.boldadmin.nexus.service.worklog.WorkLogService
import org.springframework.scheduling.annotation.Scheduled
import org.springframework.stereotype.Component

@Component
class EndOfWorkScheduler(private val workLogService: WorkLogService) {

    @Scheduled(cron = "0 */10 * * * *")
    fun schedule() {
        workLogService.endAllStartedWorkWhereWorkTimeEnded()
    }

}
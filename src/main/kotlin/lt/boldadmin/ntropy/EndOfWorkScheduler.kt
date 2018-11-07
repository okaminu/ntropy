package lt.boldadmin.ntropy

import lt.boldadmin.nexus.service.worklog.status.WorklogStartEndService
import org.springframework.scheduling.annotation.Scheduled
import org.springframework.stereotype.Component

@Component
class EndOfWorkScheduler(private val worklogStartEndService: WorklogStartEndService) {

    @Scheduled(cron = "0 */10 * * * *")
    fun schedule() {
        worklogStartEndService.endAllStartedWorkWhereWorkTimeEnded()
    }

}
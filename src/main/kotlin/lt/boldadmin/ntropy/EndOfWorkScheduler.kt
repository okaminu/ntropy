package lt.boldadmin.ntropy

import lt.boldadmin.nexus.api.service.worklog.WorklogStatusService
import org.springframework.scheduling.annotation.Scheduled
import org.springframework.stereotype.Component

@Component
class EndOfWorkScheduler(private val worklogStatusService: WorklogStatusService) {

    @Scheduled(cron = "0 */10 * * * *")
    fun schedule() {
        worklogStatusService.endAllStartedWorkWhereWorkTimeEnded()
    }

}

package lt.boldadmin.ntropy

import lt.boldadmin.nexus.api.service.worklog.status.WorklogOvertimeService
import org.springframework.scheduling.annotation.Scheduled
import org.springframework.stereotype.Component

@Component
class EndOfWorkScheduler(private val service: WorklogOvertimeService) {

    @Scheduled(cron = "0 */10 * * * *")
    fun schedule() {
        service.endAllStartedWorkWhereWorkTimeEnded()
    }

}

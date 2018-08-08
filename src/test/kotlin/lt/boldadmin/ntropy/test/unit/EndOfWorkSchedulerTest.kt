package lt.boldadmin.ntropy.test.unit

import com.nhaarman.mockito_kotlin.mock
import com.nhaarman.mockito_kotlin.verify
import lt.boldadmin.nexus.service.worklog.WorkLogService
import lt.boldadmin.ntropy.EndOfWorkScheduler
import org.junit.Test

class EndOfWorkSchedulerTest {

    @Test
    fun `Schedules an end of work for collaborators`() {
        val workLogServiceSpy = mock<WorkLogService>()

        EndOfWorkScheduler(workLogServiceSpy).schedule()

        verify(workLogServiceSpy).endAllStartedWorkWhereWorkTimeEnded()
    }

}
package lt.boldadmin.ntropy.test.unit

import com.nhaarman.mockito_kotlin.mock
import com.nhaarman.mockito_kotlin.verify
import lt.boldadmin.nexus.service.worklog.status.WorkLogStartEndService
import lt.boldadmin.ntropy.EndOfWorkScheduler
import org.junit.Test

class EndOfWorkSchedulerTest {

    @Test
    fun `Schedules an end of work for collaborators`() {
        val workLogStartEndServiceSpy = mock<WorkLogStartEndService>()

        EndOfWorkScheduler(workLogStartEndServiceSpy).schedule()

        verify(workLogStartEndServiceSpy).endAllStartedWorkWhereWorkTimeEnded()
    }

}
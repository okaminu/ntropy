package lt.boldadmin.ntropy.test.unit

import com.nhaarman.mockitokotlin2.mock
import com.nhaarman.mockitokotlin2.verify
import lt.boldadmin.nexus.api.service.worklog.WorklogStatusService
import lt.boldadmin.ntropy.EndOfWorkScheduler
import org.junit.jupiter.api.Test

class EndOfWorkSchedulerTest {

    @Test
    fun `Schedules an end of work for collaborators`() {
        val worklogStatusServiceSpy: WorklogStatusService = mock()

        EndOfWorkScheduler(worklogStatusServiceSpy).schedule()

        verify(worklogStatusServiceSpy).endAllStartedWorkWhereWorkTimeEnded()
    }

}

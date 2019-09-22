package lt.boldadmin.ntropy.test.unit

import com.nhaarman.mockitokotlin2.mock
import com.nhaarman.mockitokotlin2.verify
import lt.boldadmin.nexus.api.service.worklog.status.WorklogStartEndService
import lt.boldadmin.nexus.api.service.worklog.status.WorklogsEndService
import lt.boldadmin.ntropy.EndOfWorkScheduler
import org.junit.jupiter.api.Test

class EndOfWorkSchedulerTest {

    @Test
    fun `Schedules an end of work for collaborators`() {
        val serviceSpy: WorklogsEndService = mock()

        EndOfWorkScheduler(serviceSpy).schedule()

        verify(serviceSpy).endAllStartedWorkWhereWorkTimeEnded()
    }

}

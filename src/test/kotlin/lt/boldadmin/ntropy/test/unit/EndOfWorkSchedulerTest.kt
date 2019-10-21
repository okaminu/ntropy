package lt.boldadmin.ntropy.test.unit

import com.nhaarman.mockitokotlin2.mock
import com.nhaarman.mockitokotlin2.verify
import lt.boldadmin.nexus.api.service.worklog.WorklogOvertimeService
import lt.boldadmin.ntropy.EndOfWorkScheduler
import org.junit.jupiter.api.Test

class EndOfWorkSchedulerTest {

    @Test
    fun `Schedules an end of work for collaborators`() {
        val serviceSpy: WorklogOvertimeService = mock()

        EndOfWorkScheduler(serviceSpy).schedule()

        verify(serviceSpy).endOnOvertime()
    }

}

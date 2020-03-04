package lt.boldadmin.ntropy.test.unit

import io.mockk.*
import lt.boldadmin.nexus.api.service.worklog.WorklogOvertimeService
import lt.boldadmin.ntropy.EndOfWorkScheduler
import org.junit.jupiter.api.Test

class EndOfWorkSchedulerTest {

    @Test
    fun `Schedules an end of work for collaborators`() {
        val serviceSpy: WorklogOvertimeService = mockk()
        every { serviceSpy.endOnOvertime() } just Runs

        EndOfWorkScheduler(serviceSpy).schedule()

        verify { (serviceSpy).endOnOvertime() }
    }

}

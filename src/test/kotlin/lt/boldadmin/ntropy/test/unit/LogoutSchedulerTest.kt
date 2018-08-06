package lt.boldadmin.ntropy.test.unit

import com.nhaarman.mockito_kotlin.mock
import com.nhaarman.mockito_kotlin.verify
import lt.boldadmin.nexus.service.worklog.WorkLogService
import lt.boldadmin.ntropy.LogoutScheduler
import org.junit.Test

class LogoutSchedulerTest {

    @Test
    fun `Schedules logout for collaborators`() {
        val workLogServiceSpy = mock<WorkLogService>()

        LogoutScheduler(workLogServiceSpy).schedule()

        verify(workLogServiceSpy).logout()
    }

}
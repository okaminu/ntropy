package lt.boldadmin.ntropy.test.unit

import com.nhaarman.mockito_kotlin.mock
import com.nhaarman.mockito_kotlin.verify
import lt.boldadmin.nexus.service.LogoutService
import lt.boldadmin.ntropy.LogoutScheduler
import org.junit.Test

class LogoutSchedulerTest {

    @Test
    fun `Schedules collaborator's logout`() {
        val logoutServiceSpy = mock<LogoutService>()

        LogoutScheduler(logoutServiceSpy).schedule()

        verify(logoutServiceSpy).logout()
    }

}
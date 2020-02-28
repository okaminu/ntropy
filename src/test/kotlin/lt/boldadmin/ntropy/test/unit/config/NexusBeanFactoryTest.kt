package lt.boldadmin.ntropy.test.unit.config

import io.mockk.every
import io.mockk.mockk
import lt.boldadmin.nexus.api.service.collaborator.WorkWeekUpdateSubscriber
import lt.boldadmin.ntropy.config.NexusBeanFactory
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test
import org.springframework.context.support.GenericApplicationContext

class NexusBeanFactoryTest {

    @Test
    @Suppress("RemoveExplicitTypeArguments")
    fun `Provides Collaborator work week update subscriber`() {
        val contextStub: GenericApplicationContext = mockk()
        val expectedSubscriber: WorkWeekUpdateSubscriber = mockk()
        every {
            contextStub.getBean(any<String>(), WorkWeekUpdateSubscriber::class.java)
        } returns expectedSubscriber

        val actualSubscriber = NexusBeanFactory(contextStub).createCollaboratorUpdateSubscribersProvider().invoke()

        assertEquals(expectedSubscriber, actualSubscriber)
    }

}

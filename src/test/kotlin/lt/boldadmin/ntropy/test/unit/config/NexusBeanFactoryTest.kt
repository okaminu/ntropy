package lt.boldadmin.ntropy.test.unit.config

import io.mockk.every
import io.mockk.mockk
import lt.boldadmin.nexus.api.service.collaborator.CollaboratorUpdateSubscriber
import lt.boldadmin.ntropy.config.NexusBeanFactory
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test
import org.springframework.context.support.GenericApplicationContext

class NexusBeanFactoryTest {

    @Test
    @Suppress("RemoveExplicitTypeArguments")
    fun `Provides Collaborator update subscribers map`() {
        val contextStub: GenericApplicationContext = mockk()
        val workWeekUpdateDummy: CollaboratorUpdateSubscriber = mockk()
        val expectedListenersMap = mapOf("workWeek" to workWeekUpdateDummy)
        every {
            contextStub.getBean(any<String>(), eq(CollaboratorUpdateSubscriber::class.java))
        } returns workWeekUpdateDummy

        val actualListenersMap = NexusBeanFactory(contextStub).createCollaboratorUpdateSubscribersProvider().invoke()

        assertEquals(expectedListenersMap, actualListenersMap)
    }

}

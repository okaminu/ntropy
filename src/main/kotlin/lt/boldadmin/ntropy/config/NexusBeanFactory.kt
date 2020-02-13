package lt.boldadmin.ntropy.config

import lt.boldadmin.nexus.api.service.collaborator.CollaboratorUpdateSubscriber
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.context.support.GenericApplicationContext

@Configuration
open class NexusBeanFactory(private var context: GenericApplicationContext) {

    @Bean
    open fun createCollaboratorUpdateSubscribersProvider() = {
        mapOf(
            "workWeek" to context.getBean<CollaboratorUpdateSubscriber>(
                "collaboratorWorkEndOnOvertimeService", CollaboratorUpdateSubscriber::class.java
            )
        )
    }
}

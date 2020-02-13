package lt.boldadmin.ntropy.config

import lt.boldadmin.nexus.api.service.collaborator.WorkWeekUpdateSubscriber
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.context.support.GenericApplicationContext

@Configuration
open class NexusBeanFactory(private var context: GenericApplicationContext) {

    @Bean
    open fun createCollaboratorUpdateSubscribersProvider() = {
        context.getBean<WorkWeekUpdateSubscriber>(
            "collaboratorWorkEndOnOvertimeSubscriber", WorkWeekUpdateSubscriber::class.java
        )
    }
}

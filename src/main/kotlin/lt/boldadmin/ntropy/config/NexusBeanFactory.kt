package lt.boldadmin.ntropy.config

import lt.boldadmin.nexus.api.service.worklog.CollaboratorUpdateSubscriber
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.context.support.GenericApplicationContext

@Configuration
open class NexusBeanFactory(private var context: GenericApplicationContext) {

    @Bean
    open fun createCollaboratorUpdateSubscribersProvider() =
        {
            mapOf(
                "workTime.startOfDayInMinutes" to context.getBean<CollaboratorUpdateSubscriber>(
                    "collaboratorWorkEndByWorkTimeStartSubscriber", CollaboratorUpdateSubscriber::class.java
                ),
                "workTime.endOfDayInMinutes" to context.getBean<CollaboratorUpdateSubscriber>(
                    "collaboratorWorkEndByWorkTimeEndSubscriber", CollaboratorUpdateSubscriber::class.java
                )
            )
        }

}
package lt.boldadmin.ntropy.config

import lt.boldadmin.nexus.api.service.worklog.CollaboratorUpdateListener
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.context.support.GenericApplicationContext

@Configuration
open class NexusBeanFactory(private var context: GenericApplicationContext) {

    @Bean
    open fun createCollaboratorUpdateListenerProvider() =
        {
            mapOf(
                "workTime.startOfDayInMinutes" to context.getBean<CollaboratorUpdateListener>(
                    "collaboratorWorkTimeStartUpdateListener",
                    CollaboratorUpdateListener::class.java
                ),
                "workTime.endOfDayInMinutes" to context.getBean<CollaboratorUpdateListener>(
                    "collaboratorWorkTimeEndUpdateListener",
                    CollaboratorUpdateListener::class.java
                )
            )
        }

}
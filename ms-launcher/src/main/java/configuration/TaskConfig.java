package configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import adapters.task.TaskJpaAdapter;
import ports.api.task.TaskServicePort;
import ports.spi.task.TaskPersistencePort;
import services.task.TaskServiceImpl;

@Configuration
public class TaskConfig {

    @Bean
    public TaskPersistencePort taskPersistence() {
        return new TaskJpaAdapter();
    }

    @Bean
    public TaskServicePort taskService() {
        return new TaskServiceImpl(taskPersistence());
    }

}

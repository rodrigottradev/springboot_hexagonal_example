package configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import adapters.user.UserJpaAdapter;
import ports.api.user.UserServicePort;
import ports.spi.user.UserPersistencePort;
import services.user.UserServiceImpl;

@Configuration
public class UserConfig {

    @Bean
    public UserPersistencePort userPersistence() {
        return new UserJpaAdapter();
    }

    @Bean
    public UserServicePort userService() {
        return new UserServiceImpl(userPersistence());
    }

}

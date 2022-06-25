package ua.grayloki8.spring.musicplayer;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("ua.grayloki8.spring.musicplayer")
@PropertySource("classpath:musicPlayer.properties")
public class SpringConfig {
    @Bean
    public PopMusic popMusic(){
        return new PopMusic();
    }
}

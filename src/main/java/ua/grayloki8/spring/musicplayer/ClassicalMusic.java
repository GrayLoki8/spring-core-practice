package ua.grayloki8.spring.musicplayer;

import org.springframework.stereotype.Component;

@Component
public class ClassicalMusic implements Music {


    @Override
    public String getSong() {
        return "Vivaldi summer";
    }
}

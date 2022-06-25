package ua.grayloki8.spring.musicplayer;

import org.springframework.stereotype.Component;

@Component

public class RockMusic implements Music{
    @Override
    public String getSong() {
        return "Wind cries Mary";
    }
}

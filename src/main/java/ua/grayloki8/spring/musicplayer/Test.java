package ua.grayloki8.spring.musicplayer;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import ua.grayloki8.spring.test.TestBean;

public class Test {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("applicationContext");
        MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
        musicPlayer.playMusic();
       // MusicPlayer musicPlayer=new MusicPlayer(music);
        context.close();
    }
}

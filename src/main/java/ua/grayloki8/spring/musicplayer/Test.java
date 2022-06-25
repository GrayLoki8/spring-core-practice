package ua.grayloki8.spring.musicplayer;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import ua.grayloki8.spring.test.TestBean;

import java.lang.annotation.Annotation;

public class Test {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(SpringConfig.class);
        MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
      musicPlayer.playMusic();
        PopMusic popMusic = context.getBean("popMusic", PopMusic.class);
        System.out.println(popMusic.getSong());
     /*   MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
        musicPlayer.playMusic();
       // MusicPlayer musicPlayer=new MusicPlayer(music);
        System.out.println(musicPlayer.getName());
        System.out.println(musicPlayer.getVolume());*/
        context.close();
    }
}

package ua.grayloki8.spring.musicplayer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class MusicPlayer {
    @Qualifier("classicalMusic")
    @Autowired
    private Music music;
    private String name;
    private int volume;

    public MusicPlayer() {
    }

    //IoC
    public MusicPlayer(Music music){
        this.music=music;
    }

    public void playMusic(){
        System.out.println("Playing: "+music.getSong());
    }

    public Music getMusic() {
        return music;
    }

    public void setMusic(Music music) {
        this.music = music;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }
}

package hus.oop.lab10.adapter.example;

public class Mp4Player implements AdvancedMediaPlayer {
    @Override
    public void playVideo(String fileName) {
        System.out.println("Playing video file: " + fileName);
    }
}
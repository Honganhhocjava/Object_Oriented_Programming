package hus.oop.lab10.adapter.example;

public class Main {
    public static void main(String[] args) {
        MediaPlayer mediaPlayer = new MediaPlayerAdapter(new Mp4Player());

        mediaPlayer.playAudio("mp3", "song.mp3");
        mediaPlayer.playAudio("mp4", "movie.mp4");
    }
}

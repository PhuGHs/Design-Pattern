package structural_dp.adapter.audio_players;

//Client
public class AudioPlayer implements MediaPlayer {
    AdvancedMediaPlayerAdapter adapter;
    @Override
    public void play(String audioType, String fileName) {
        if (audioType.equalsIgnoreCase("mp3")) {
            System.out.println("Playing mp3: " + fileName);
        } else if (audioType.equalsIgnoreCase("vlc") || audioType.equalsIgnoreCase("mp4")) {
            adapter = new AdvancedMediaPlayerAdapter(audioType);
            adapter.play(audioType, fileName);
        } else {
            System.out.println("Unsupported audio type: " + audioType);
        }
    }
}

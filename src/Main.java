import structural_dp.adapter.adapters.SquarePegAdapter;
import structural_dp.adapter.audio_players.AudioPlayer;
import structural_dp.adapter.models.RoundHole;
import structural_dp.adapter.models.RoundPeg;
import structural_dp.adapter.models.SquarePeg;

public class Main {
    public static void main(String[] args) {
        //Ctrl + Alt + T to make code blocks
        //region --Adapter
            //region -AudioPlayer
                AudioPlayer audioPlayer = new AudioPlayer();
                audioPlayer.play("mp5", "I can't breathe.mp5");
                audioPlayer.play("mp3", "Lilwyn album.mp3");
                audioPlayer.play("vlc", "VungTau.vlc");
                audioPlayer.play("mp4", "Lilwy album.mp4");
            //endregion
        //endregion
    }
}
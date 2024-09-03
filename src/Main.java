import structural_dp.adapter.adapters.SquarePegAdapter;
import structural_dp.adapter.audio_players.AudioPlayer;
import structural_dp.adapter.models.RoundHole;
import structural_dp.adapter.models.RoundPeg;
import structural_dp.adapter.models.SquarePeg;
import structural_dp.adapter.posts.*;
import structural_dp.decorator.example.Client;

import java.time.LocalDate;
import java.util.List;

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
            //region -HighestLikeIndexPost
                ABCNewsAgency agency = new ABCNewsAgency();
                    agency.add(new TraditionalPost("Post 1", 1, LocalDate.of(2020, 4, 20), "Content post 1", 20, 4));
                    agency.add(new TraditionalPost("Post 2", 2, LocalDate.of(2022, 4, 20), "Content post 2", 4, 14));
                    agency.add(new TraditionalPost("Post 3", 3, LocalDate.of(2024, 4, 20), "Content post 2", 15, 2));

                    ModernPost mp1 = new ModernPost("Modern post 1", 4, LocalDate.of(2024, 4, 20), "Content post 1",1, 1, 1, 1, 1, 1, 1);
                    ModernPost mp2 = new ModernPost("Modern Post 2", 5, LocalDate.of(2019, 8, 20), "Content post 1",1, 2, 1, 1, 1, 1, 1);
                    ModernPost mp3 = new ModernPost("Modern Post 3", 6, LocalDate.of(2023, 1, 20), "Content post 1",1, 2, 1, 1, 1, 1, 1);
                    agency.add(new ModernPostAdapter(mp1));
                    agency.add(new ModernPostAdapter(mp2));
                    agency.add(new ModernPostAdapter(mp3));

                    System.out.println("Highest like index post: ");
                    ITraditionalPost post = agency.getHighestLikeIndexPost();
                    post.print();
            //endregion
        //endregion
        //region --Decorator
        Client client = new Client();
        client.sendMessage("This is a test message");
        //endregion
    }
}

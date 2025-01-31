package oop1;

public class MusicPlayerMain4 {

    public static void main(String[] args) {
        MusicPlayer player = new MusicPlayer();

        //on
        player.on();

        //volume up
        player.volumeUp();

        //volume up
        player.volumeUp();

        //volume down
        player.volumeDown();

        //player state
        player.showStatus();

        //player off
        player.off();
    }
}

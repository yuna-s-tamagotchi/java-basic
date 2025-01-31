package oop1;

public class MusicPlayerMain2 {

    public static void main(String[] args) {
        MusicPlayerData data = new MusicPlayerData();


        //on
        data.isOn = true;
        System.out.println("player start");

        //volume up
        data.volume++;
        System.out.println("volume: " + data.volume);

        //volume up
        data.volume++;
        System.out.println("volume: " + data.volume);

        //volume down
        data.volume--;
        System.out.println("volume: " + data.volume);

        //player state
        System.out.println("state");
        if (data.isOn) {
            System.out.println("player on, volume: " + data.volume);
        } else {
            System.out.println("player off");
        }

        //player off
        data.isOn = false;
        System.out.println("player off");

    }
}

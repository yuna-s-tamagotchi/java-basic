package oop1;

public class MusicPlayerMain1 {

    public static void main(String[] args) {
        int volume = 0;
        boolean isOn = false;

        //on
        isOn = true;
        System.out.println("player start");

        //volume up
        volume++;
        System.out.println("volume: " + volume);

        //volume up
        volume++;
        System.out.println("volume: " + volume);

        //volume down
        volume--;
        System.out.println("volume: " + volume);

        //player state
        System.out.println("state");
        if (isOn) {
            System.out.println("player on, volume: " + volume);
        } else {
            System.out.println("player off");
        }

        //player off
        isOn = false;
        System.out.println("player off");


    }
}

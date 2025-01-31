package oop1;

public class MusicPlayerMain3 {
    public static void main(String[] args) {
        MusicPlayerData data = new MusicPlayerData();

        //on
        on(data);

        //volume up
        volumeUp(data);

        //volume up
        volumeUp(data);

        //volume down
        volumeDown(data);

        //player state
        showStatus(data);

        //player off
        off(data);
    }

    static void on(MusicPlayerData data) {
        data.isOn = true;
        System.out.println("player start");
    }

    static void off(MusicPlayerData data) {
        data.isOn = false;
        System.out.println("player start");
    }

    static void volumeUp(MusicPlayerData data) {
        data.volume ++;
        System.out.println("volume: " + data.volume);
    }

    static void volumeDown(MusicPlayerData data) {
        data.volume --;
        System.out.println("volume: " + data.volume);
    }

    static void showStatus(MusicPlayerData data) {
        System.out.println("state");
        if (data.isOn) {
            System.out.println("player on, volume: " + data.volume);
        } else {
            System.out.println("player off");
        }
    }
}

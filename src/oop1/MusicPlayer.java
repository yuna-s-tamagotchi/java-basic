package oop1;

public class MusicPlayer {

    int volume = 0;
    boolean isOn = false;

    void on() {
        isOn = true;
        System.out.println("player start");
    }

    void off() {
        isOn = false;
        System.out.println("player start");
    }

    void volumeUp() {
        volume ++;
        System.out.println("volume: " + volume);
    }

    void volumeDown() {
        volume --;
        System.out.println("volume: " + volume);
    }

    void showStatus() {
        System.out.println("state");
        if (isOn) {
            System.out.println("player on, volume: " + volume);
        } else {
            System.out.println("player off");
        }
    }
}

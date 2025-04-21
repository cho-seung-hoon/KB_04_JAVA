package ch08.sec04;

public class Television implements RemoteControl{
    private int volume;

    @Override
    public void turnOn() {
        System.out.println("Audio 켜기");
    }

    @Override
    public void turnOff() {
        System.out.println("Audio 끄기");
    }

    @Override
    public void setVolume(int volume) {
        if(volume < MIN_VOLUME)
            volume = MIN_VOLUME;
        else if(volume > MAX_VOLUME)
            volume = MAX_VOLUME;

        this.volume = volume;

        System.out.println("현재 볼륨 : " + volume);
    }
}

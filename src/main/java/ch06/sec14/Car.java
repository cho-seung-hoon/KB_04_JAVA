package ch06.sec14;

public class Car {
    //필드 선언
    private int speed;
    private  boolean stop;

    public Car() {
    }

    public Car(int speed, boolean stop) {
        this.speed = speed;
        this.stop = stop;
    }

    //speed 필드의 Getter/Setter 선언
    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        if(speed < 0) {
            this.speed = 0;
            return;
        } else {
            this.speed = speed;
        }
    }

    public boolean isStop() {
        return stop;
    }

    //stop 필드의 Getter/Setter 선언
    public void setStop(boolean stop) {
        this.stop = stop;
        if(stop)
            this.speed = 0;
    }
}

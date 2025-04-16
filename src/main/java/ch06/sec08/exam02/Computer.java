package ch06.sec08.exam02;

public class Computer {
    public Computer() {
    }
    public int sum(int... numbers) {
        int sum = 0;
        for(int num : numbers) {
            sum += num;
        }
        return sum;
    }
}

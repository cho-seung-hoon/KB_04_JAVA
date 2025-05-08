package ch17.sec04.exam03;

import java.util.stream.IntStream;

public class StreamExample {
    public static int sum;  // 합계를구하기위한변수
    public static void main(String[] args) {
        sum = IntStream.range(1, 101).sum();
        System.out.println("sum = " + sum);
    }
}
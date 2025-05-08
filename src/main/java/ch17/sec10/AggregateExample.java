package ch17.sec10;

import java.util.Arrays;

public class AggregateExample {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};

        // 2의 배수 카운팅
        long count = Arrays.stream(arr)
                .filter(s -> s % 2 == 0)
                .count();
        System.out.println("2의 배수 개수: " + count);

        // 2의 배수 총합
        int sum = Arrays.stream(arr)
                .filter(s -> s % 2 == 0)
                .sum();
        System.out.println("2의 배수 총합: " + sum);

        // 2의 배수 평균
        Arrays.stream(arr)
                .filter(s -> s % 2 == 0)
                .average()
                .ifPresent(avg -> System.out.println("2의 배수 평균: " + avg));

        // 2의 배수 중 최대값
        Arrays.stream(arr)
                .filter(s -> s % 2 == 0)
                .max()
                .ifPresent(max -> System.out.println("2의 배수 중 최대값: " + max));

        // 2의 배수 중 최소값
        Arrays.stream(arr)
                .filter(s -> s % 2 == 0)
                .min()
                .ifPresent(min -> System.out.println("2의 배수 중 최소값: " + min));

        // 첫 번째 3의 배수
        Arrays.stream(arr)
                .filter(s -> s % 3 == 0)
                .findFirst()
                .ifPresent(first -> System.out.println("첫 번째 3의 배수: " + first));
    }
}

package ch17.sec10;

import java.util.ArrayList;
import java.util.List;
import java.util.OptionalDouble;

public class OptionalExample {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        OptionalDouble optionalAvg = list.stream()
                .mapToInt(Integer::intValue)
                .average();

        double avg = optionalAvg.orElse(0.0);

        System.out.println("평균: " + avg);
    }
}

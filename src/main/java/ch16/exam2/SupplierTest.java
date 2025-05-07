package ch16.exam2;

import java.util.Random;
import java.util.function.IntSupplier;
import java.util.function.Supplier;

public class SupplierTest {
    public static void main(String[] args) {

        //Suppier 계열 : 매개변수 X, 반환형 O
        // - 값을 제공

        //Supplier<T> : T 제공
        Supplier<String> nameSupplier = () -> {return "신짱구";};
        System.out.println("name : " + nameSupplier.get());

        //IntSupplier : int 타입 제공
        IntSupplier randomIntSupplier = () -> {
            Random random = new Random();
            return random.nextInt(100);
        };

        System.out.println("random : " + randomIntSupplier.getAsInt());
        System.out.println("random : " + randomIntSupplier.getAsInt());
        System.out.println("random : " + randomIntSupplier.getAsInt());
    }
}

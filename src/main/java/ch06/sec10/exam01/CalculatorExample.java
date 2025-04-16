package ch06.sec10.exam01;

public class CalculatorExample {
    public static void main(String[] args) {
        Calculator cal = new Calculator();

        double result1 = 10 * 10 * cal.pi;  // 원의넓이
        int result2 = cal.plus(10, 5); // 10, 5의합
        int result3 = cal.minus(10, 5); // 10, 5의차
        System.out.println("result1 : " + result1);
        System.out.println("result2 : " + result2);
        System.out.println("result3 : " + result3);
    }
}
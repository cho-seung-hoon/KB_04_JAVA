package ch07.sec04.exam01;

public class ComputerExample {
    public static void main(String[] args) {
        Computer computer = new Computer();
        computer.areaCircle(3);
        System.out.println(computer.areaCircle(2) + " \n");
        Calculator calculator = new Calculator();
        System.out.println(calculator.areaCircle(2));
    }
}

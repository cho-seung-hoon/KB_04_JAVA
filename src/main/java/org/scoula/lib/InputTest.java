package org.scoula.lib;

public class InputTest {
    public static void main(String[] args) {
        Input input = new Input();
        String name = input.read("이름을 입력하세요: ");
        System.out.println("입력한 값: " + name);

        String name1 = input.read("이름을 입력하세요: ");
        System.out.println("입력한 값: " + name1);

        int age = input.readInt("나이를 입력하세요: ");
        System.out.println("입력한 값: " + age);

        boolean continueProgram = input.confirm("프로그램을 계속하시겠습니까?");
        System.out.println("입력한 값: " + continueProgram);
    }
}

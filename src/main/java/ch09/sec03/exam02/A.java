package ch09.sec03.exam02;

public class A {
    //정적멤버클래스
    static class B {
        //인스턴스필드
        int field1 = 1;
        static int field2 = 2;
        //생성자
        B() {
            System.out.println("B-생성자실행");
        }

        //인스턴스메소드
        void method1() {
            System.out.println("B-method1실행");
        }
        //정적메소드(Java17부터허용)
        static void method2() {
            System.out.println("B-method2실행");
        }
    }
}
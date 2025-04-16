package ch05;

public class ex03 {
    public static void main(String[] args) {
        for(int j = 5; j >= 0; j--) {
            for(int i = 1; i <= j; i++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

package ch05;

public class ex06 {
    public static void main(String[] args) {
        int[] array = { 1, 5, 3, 8, 2};
        int max = 0;

        for(int a : array){
            if(max < a){
                max = a;
            }
        }
        System.out.println(max);
    }
}

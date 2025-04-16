package ch05;

import java.util.Scanner;

public class ex09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean run = true;
        int[] scores = new int[4];

        while(run) {
            System.out.println("-----------------------------");
            System.out.println("1. 학생수 | 2. 점수입력 | 3. 점수리스트 | 4. 분석 | 5. 종료");
            System.out.println("-----------------------------");
            System.out.print("선택> ");
            String strNum = scanner.nextLine();

            if(strNum.equals("1")) {
                System.out.println("학생수> " + scores.length);
            } else if(strNum.equals("2")) { // scores[0]> 09
                for(int i = 0; i < scores.length; i++) {
                    System.out.print("scores[" + i + "]> ");
                    strNum = scanner.nextLine();
                    scores[i] = Integer.parseInt(strNum);
                }
            } else if(strNum.equals("3")) { // scores[0]> 09
                for(int i = 0; i < scores.length; i++) {
                    System.out.println("scores[" + i + "]> " + scores[i]);
                }
            } else if(strNum.equals("4")) {
                int max = 0;
                for(int i = 0; i < scores.length; i++) {
                    if(scores[i] > max) {
                        max = scores[i];
                    }
                }
                int avg = max / scores.length;
                System.out.println("최고 점수> " + max);
                System.out.println("평균 점수> " + avg);
            } else if(strNum.equals("5")) {
                run = false;
            }
        }
        System.out.println("프로그램 종료");
    }
}

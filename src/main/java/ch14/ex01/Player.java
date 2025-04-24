package ch14.ex01;


import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Random;

@Data
@AllArgsConstructor
public class Player implements Runnable{
    Random random = new Random();
    String name;

    public Player(String s) {
        name = s;
    }

    @Override
    public void run() {
        try{
            int curr = Main.count;

            Thread.sleep(random.nextInt(5) * 200 + 1000);

            while(curr == Main.count) {
                curr = Main.count;
                Thread.sleep(random.nextInt(5) * 200);
            }

            synchronized(Main.class) {
                int callNumber = ++Main.count;
                System.out.printf("%-10s:%2d\n", name,callNumber);

                if(callNumber == Main.finalNumber) {
                    System.out.println(name + "벌칙 당첨!!");
                }
            }
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}

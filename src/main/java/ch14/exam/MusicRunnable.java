package ch14.exam;

public class MusicRunnable implements Runnable {
    @Override
    public void run() {
        for(int i = 0; i < 10; i++) {
                System.out.println("음악 재생합니다 ");
                try {
                    Thread.sleep(500);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    ;}


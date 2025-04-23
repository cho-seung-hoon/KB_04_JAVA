package ch11.sec03.exam03;

public class ExceptionHandlingExample {
    public static void main(String[] args) {
        String[] array = {"100", "1oo", null, "200"};

        try {
            for(int i=0; i<=array.length; i++) {
                int value = Integer.parseInt(array[i]);
                System.out.println("array[" + i+ "]: " + value);
            }
        } catch(ArrayIndexOutOfBoundsException e) {
            e.printStackTrace();
            System.out.println("배열 초과");
        } catch(NullPointerException e) {
            e.printStackTrace();
            System.out.println("변수 오류");
        } catch(NumberFormatException e) {
            e.printStackTrace();
            System.out.println("포맷 오류");
        }

    }
}

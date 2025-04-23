package ch11.sec03.exam01;

public class ExceptionHandlingExample {
    public static void main(String[] args) {
        String[] array = {"100", "12"};

        try {
            for(int i=0; i<=array.length; i++) {
                int value = Integer.parseInt(array[i]);
                System.out.println("array[" + i+ "]: " + value);
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            e.printStackTrace();
            System.out.println("배열 초과");
        }  catch (NumberFormatException e) {
            e.printStackTrace();
            System.out.println("포맷 오류");
        }

    }
}

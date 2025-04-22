package ch09.sec07.exam03;

public class ButtonExample {
    public static void main(String[] args) {
        //Ok 버튼객체생성
        Button btnOk = new Button();
        //Ok 버튼객체에ClickListener 구현객체주입
        btnOk.setClickListener(new Button.ClickListener() {

            @Override
            public void onClick() {
                System.out.println("ok버튼 클릭했습니다.");
            }
        });
        //Ok 버튼클릭하기
        btnOk.click();
        //Cancel 버튼 객체생성
        Button btnCancel = new Button();
        //Cancel 버튼 객체에ClickListener 구현객체주입
        btnCancel.setClickListener(new Button.ClickListener() {

            @Override
            public void onClick() {
                System.out.println("Cancel버튼 클릭했습니다.");
            }
        });
        //Cancel 버튼 클릭하기
        btnCancel.click();
    }
}

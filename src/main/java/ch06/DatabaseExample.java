package ch06;

public class DatabaseExample {
    public static void main(String[] args) {
        Database db = Database.getInstance();
        Database db2 = Database.getInstance();

        System.out.println(db == db2);

        System.out.println("데이터베이스:" + db.connect());
        db.close();
    }
}

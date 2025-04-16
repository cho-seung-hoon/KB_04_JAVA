package ch06;

class Database {
    private static Database instance;
    private static String connection = "MySQL";

    private Database() {
    }

    public static Database getInstance() {
        if(instance == null) {
            instance = new Database();
        }
        return instance;
    }

    public static String connect() {
        System.out.println(connection + "에 연결합니다.");
        return connection;
    }
    public static void close() {
        System.out.println(connection + "을 닫습니다.");
    }
}

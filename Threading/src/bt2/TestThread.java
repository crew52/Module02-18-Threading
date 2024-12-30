package bt2;

public class TestThread {
    public static void main(String[] args) {
        // Tạo các thread
        OddThread oddThread = new OddThread();
        EvenThread evenThread = new EvenThread();

        // Khởi động thread
        oddThread.start();

        try {
            oddThread.join(); // Đợi OddThread kết thúc trước khi bắt đầu EvenThread
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        evenThread.start();
    }
}

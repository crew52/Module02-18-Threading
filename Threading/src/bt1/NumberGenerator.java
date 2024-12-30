package bt1;

import java.util.Random;

public class NumberGenerator implements Runnable {
    @Override
    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println("Thread: " + Thread.currentThread().getName() +
                    ", Number: " + i +
                    ", HashCode: " + this.hashCode());
            try {
                Thread.sleep(500); // Dừng 500 milliseconds
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        // Tạo 2 đối tượng NumberGenerator
        NumberGenerator generator1 = new NumberGenerator();
        NumberGenerator generator2 = new NumberGenerator();

        // Tạo 2 thread với các đối tượng NumberGenerator
        Thread thread1 = new Thread(generator1);
        Thread thread2 = new Thread(generator2);

        // Đặt tên cho các thread (tuỳ chọn)
        thread1.setName("Thread-1");
        thread2.setName("Thread-2");

        // Thay đổi độ ưu tiên
        thread1.setPriority(Thread.MAX_PRIORITY); // Độ ưu tiên cao nhất
        thread2.setPriority(Thread.MIN_PRIORITY); // Độ ưu tiên thấp nhất

        // Bắt đầu các thread
        thread1.start();
        thread2.start();
    }
}

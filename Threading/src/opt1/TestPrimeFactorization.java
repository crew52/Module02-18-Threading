package opt1;

public class TestPrimeFactorization {
    public static void main(String[] args) {
        // Tạo hai đối tượng Runnable
        LazyPrimeFactorization lazyPrime = new LazyPrimeFactorization();
        OptimizedPrimeFactorization optimizedPrime = new OptimizedPrimeFactorization();

        // Tạo hai thread với hai runnable
        Thread lazyThread = new Thread(lazyPrime);
        Thread optimizedThread = new Thread(optimizedPrime);

        // Đặt tên thread (tuỳ chọn)
        lazyThread.setName("Lazy-Thread");
        optimizedThread.setName("Optimized-Thread");

        // Khởi động hai thread
        lazyThread.start();
        optimizedThread.start();
    }
}

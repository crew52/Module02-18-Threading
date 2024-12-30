package opt1;

public class LazyPrimeFactorization implements Runnable {

    @Override
    public void run() {
        int number = 2; // Bắt đầu từ 2 (số nguyên tố nhỏ nhất)
        while (true) {
            if (isPrime(number)) {
                System.out.println("LazyPrimeFactorization found: " + number);
            }
            number++;
        }
    }

    // Phương pháp kiểm tra số nguyên tố chưa tối ưu
    private boolean isPrime(int n) {
        if (n <= 1) return false;
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}


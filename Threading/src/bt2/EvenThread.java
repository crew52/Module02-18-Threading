package bt2;

public class EvenThread extends Thread {
    @Override
    public void run() {
        for (int i = 2; i <= 10; i += 2) {
            System.out.println("EvenThread: " + i);
            try {
                Thread.sleep(15); // Dừng 15 milliseconds
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

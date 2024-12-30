package demoS;

public class SharedResource {
//    public synchronized void display(String msg) {
//        System.out.print("[" + msg);
//        try {
//            Thread.sleep(1000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//        System.out.println("]");
//    }

    public void display(String msg) {
        synchronized (this) {
            System.out.print("[" + msg);
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("]");
        }
    }
}

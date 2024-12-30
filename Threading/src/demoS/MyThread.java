package demoS;

class MyThread extends Thread {
    SharedResource resource;
    String message;

    MyThread(SharedResource resource, String message) {
        this.resource = resource;
        this.message = message;
    }

    @Override
    public void run() {
        resource.display(message);
    }
}
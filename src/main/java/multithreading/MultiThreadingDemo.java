package multithreading;

public class MultiThreadingDemo extends Thread {
    public void run() {
        System.out.println("Thread:"+Thread.currentThread().getId()+"is running");
    }

    public static void main(String[] args) {
        for(int i=0;i <8; i++) {
            MultiThreadingDemo multiThreadingDemo = new MultiThreadingDemo();
            multiThreadingDemo.start();
        }
    }
}

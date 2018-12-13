package multithreading;

public class MultiThreadingDemoRunnable implements Runnable {
    public void run(){
        System.out.println("Thread:"+Thread.currentThread().getId()+"is running");
    }

    public static void main(String[] args) {
        for(int i=0;i<8;i++) {
            Thread object = new Thread(new MultiThreadingDemoRunnable());
            object.start();
        }
    }

}

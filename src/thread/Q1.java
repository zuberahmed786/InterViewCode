package thread;

public class Q1{
    public static void main(String[] args) throws InterruptedException {
        MyThread myThread = new MyThread();
        myThread.start();

      // myThread.join();

        for (int i=0;i<20;i++){
            System.out.println("Main Thread");
        }
    }
}

 class MyThread extends Thread{

    public void run(){
        for (int i=0;i<20;i++){
            System.out.println("First Thread");
            try {
                sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

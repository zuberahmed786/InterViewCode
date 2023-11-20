package thread;
class SharedResource{

    boolean flag = false;

}

class MyThread1 extends Thread{
SharedResource sharedResource;

    public MyThread1(SharedResource sharedResource) {
        this.sharedResource = sharedResource;
    }

    public void run(){
        synchronized (sharedResource){
            System.out.println("Thread 1 running");
            try {
                sleep(3000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            sharedResource.flag=true;
            sharedResource.notify();
            System.out.println("Thread 1 Completed");
        }


    }
}

class MyThread2 extends Thread{

    SharedResource sharedResource;

    public MyThread2(SharedResource sharedResource) {
        this.sharedResource = sharedResource;
    }

    public void run(){
        synchronized (sharedResource){
            System.out.println("Thread 2 running");
          //  while (!sharedResource.flag){
//                try {
//                   // sharedResource.wait();
//                } catch (InterruptedException e) {
//                    throw new RuntimeException(e);
//                }
        //    }
        }
    }
}

public class WaitNotifyExample {

    public static void main(String[] args) {
   SharedResource sharedResource = new SharedResource();
   MyThread1 t1 = new MyThread1(sharedResource);
        MyThread2 t2 = new MyThread2(sharedResource);

        t1.start();
        t2.start();
    }
}

/*PART 2 :          Thread creation by implementing the Runnable Interface

We create a new class which implements java.lang.Runnable interface and override run() method.
Then we instantiate a Thread object and call start() method on this object.
*/
class MultithreadingDemo implements Runnable{
    public void run(){
        try{
            //displaying the thread that is running
            System.out.println("Thread " + Thread.currentThread().getId() +" is running");
        }catch(Exception e){
            System.out.println("Exception is caught");
        }
    }
}
public class prac6_second {
    public static void main(String[] args) {
        int n = 8; //number of threads
        for(int i = 0 ; i<n;i++){
            Thread obj = new Thread(new MultithreadingDemo());
            obj.start();
        }
    }
}

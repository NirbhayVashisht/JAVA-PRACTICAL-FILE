/*WAP to implement the process of multithreading using
 * a. Runnable Interface
 * b. Thread Class*/

/*                          THEORY
Multithreading is a Java feature that allows concurrent execution of two or more parts of a program
 for maximum utilization of CPU. Each part of such program is called a thread.
  So, threads are light-weight processes within a process.

Thread Class vs Runnable Interface

1. If we extend the Thread class, our class cannot extend any other class because Java doesn’t support multiple inheritance.
 But, if we implement the Runnable interface, our class can still extend other base classes.

2. We can achieve basic functionality of a thread by extending Thread class because it provides some inbuilt methods like
yield(), interrupt() etc. that are not available in Runnable interface.
*/

// PART 1 :             Thread creation by extending the Thread class

/*This class overrides the run() method available in the Thread class.
 A thread begins its life inside run() method.
We create an object of our new class and call start() method to start the execution of a thread.
 Start() invokes the run() method on the Thread object.*/

class MultiThreadingDemo extends Thread{
    public void run(){
        try{
            //displaying the thread that is running
            System.out.println("Thread " + Thread.currentThread().getId() + " is running");
        }
        catch(Exception e){
            System.out.println("Exception is caught");
        }
    }
}
public class prac6_first {
    public static void main(String agrvh[]){
        int n =8; //number of threads

        for (int i = 0 ; i<n;i++){
            MultiThreadingDemo obj = new MultiThreadingDemo();
            obj.start();
        }
    }
}

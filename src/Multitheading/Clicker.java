package Multitheading;

public class Clicker implements Runnable {
Thread t;
int click = 0;
private  volatile  boolean running = true;
 public Clicker (){

}
 public Clicker (int p){
     t = new Thread (this);
     t.setPriority(p);
 }
    @Override
    public void run() {
        while (running){
            click++;
        }
    }
    public void stop(){
     running = false;
    }
    public void start(){
        t.start();

    }

   public void count(){
     try{
     for(int k= 1; k<=10; k++){
         System.out.println("count"+ k);
         Thread.sleep(1000);
     }
    }catch(InterruptedException e){
         System.out.println("Counte terminated");
     }
 }

    public static void main (String[] args ){
   Thread.currentThread().setPriority(Thread.MAX_PRIORITY);
   Clicker hi = new Clicker(Thread.NORM_PRIORITY+2);
        Clicker lo = new Clicker(Thread.NORM_PRIORITY-2);
Clicker count = new Clicker(Thread.activeCount());
        System.out.println("is counter alive:"+ count.t.isAlive());

count.count();

       lo.start();
       hi.start();

       try{

           System.out.println("is counter alive:"+ count.t.isAlive());


           Thread.sleep(10000);
       }
       catch (InterruptedException e){
           System.out.println("Main thread is Interrupted");
       }
 lo.stop();
       hi.stop();

       try{
           hi.t.join();
           lo.t.join();
       }catch (InterruptedException e){
           System.out.println("Interruption Caught");
       }
       System.out.println("Low-priority thread: "+ lo.click);

        System.out.println("High-priority thread: "+ hi.click);

 }
}




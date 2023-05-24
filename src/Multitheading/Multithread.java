package Multitheading;


 class A {
     synchronized  void foo(B b) {
         String name = Thread.currentThread().getName();
         System.out.println(name+ "Entered A.foo");
         try{
             Thread.sleep(1000);

         }catch (Exception e){
             System.out.println("Interruption caught");
         }
         System.out.println(name+ " trying to call B.last()");
         b.last();

     }
     synchronized  void last(){
         System.out.println("Inside A.last");
     }
 }


class  B {
    synchronized void bar(A a)

    {
        String name = Thread.currentThread().getName();
        System.out.println(name + " Entered B.foo");

        try {
            Thread.sleep(1000);

        } catch (Exception e) {
            System.out.println("Interruption caught");
        }
        System.out.println(name + " trying to call A.last()");
        a.last();
    }
    synchronized void last() {
        System.out.println("Inside A.last()");
    }

}
class Deadlock implements Runnable{
     A a = new A();
     B b = new B();

   public Deadlock(){
         Thread.currentThread().setName("Main thread");
         Thread t = new Thread (this, "Racing Thread");
         t.start();
a.foo(b);
         System.out.println("Back in other thread");

     }
  //   @Override
     public void run(){
     b.bar(a);
        System.out.println("Back in other thread");

    }
public static void main(String[] args ){
         new Deadlock();
}

}


class MyThread extends Thread{
     String name;
     Thread t;
     boolean suspendFlag = false;
    MyThread(String threadName){
      name = threadName;
        t = new Thread (this, name);
        System.out.println("Thread Name"+ t);
        t.start();
    }
   public void run(){

        try{
            for (int i= 15; i>0; i--) {
                System.out.println(name + ": " + i);

             Thread.sleep(200);
             synchronized (this){
                 while(suspendFlag){
                     wait();
                 }
             }
            }
         }catch (InterruptedException e){
             System.out.println(name+ " Interrupted");
         }
            System.out.println(name+ " exiting");

        }


    void mySuspend(){
        suspendFlag = true;
    }

    synchronized void myResume(){
        suspendFlag = false;
        notify();
    }
}
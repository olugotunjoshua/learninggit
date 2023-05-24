package Lab11;

public class ThreadGesture implements Runnable {

    private String msg;
    private int Intervals;


    ThreadGesture(String message, int Interval) {
        this.msg = message;
        this.Intervals = Interval;

    }

    @Override
    public void run() {
        try {
while (true) {
    System.out.println(msg);
    Thread.sleep(Intervals);
}
        }catch(InterruptedException e)

    {
        System.out.println("caught Error succesfully");
    }

    }
    public static void main(String arg[]) {
        Thread t1 = new Thread(new ThreadGesture("Good morning ", 1000));
        Thread t2 = new Thread(new ThreadGesture("Hii", 2000));
        Thread t3 = new Thread(new ThreadGesture("welcome", 3000));

t1.start();
t2.start();
t3.start();

    }
}

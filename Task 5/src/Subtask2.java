
public class Subtask2 {
	public static void main(String[] args) {
        Name one = new Name(2000, 200);
        Thread two = new Thread(new Name(2000, 200), "Thread#2");
 
        two.start();
        one.run();
    }
}
 
class Name implements Runnable {
    private final int seconds;
    private final int delay;
 
    public Name(int ms, int delayMs) {
        this.seconds = ms;
        this.delay = delayMs;
    }
 
    @Override
    public void run() {
        int sum = 0;
        try {
            while (!Thread.currentThread().isInterrupted() && sum <= this.seconds) {
                System.out.println(Thread.currentThread().getName());
                Thread.sleep(this.delay);
                sum += this.delay;
            }
            System.out.printf("Thread [%s] finish work...\n", Thread.currentThread().getName());
        } catch (InterruptedException e) {
            System.out.printf("Thread [%s] is stopped!\n", Thread.currentThread().getName());
        }
    }
}


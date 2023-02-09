public class SubTask3 {

    public static void main(String[] args) throws InterruptedException {
    	
        System.out.println("Не синхронізовано");
        
        Count c = new Count();
        Thread t1 = new Thread(new MyRunnable(c));
        Thread t2 = new Thread(new MyRunnable(c));
        Thread t3 = new Thread(new MyRunnable(c));
        Thread t4 = new Thread(new MyRunnable(c));
        Thread t5 = new Thread(new MyRunnable(c));
        Thread t6 = new Thread(new MyRunnable(c));
        Thread t7 = new Thread(new MyRunnable(c));
        Thread t8 = new Thread(new MyRunnable(c));

        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
        t6.start();
        t7.start();
        t8.start();

        Thread.sleep(2000);

        System.out.println("Синхронізовано");
        Count c2 = new Count();
        Thread t10 = new Thread(new MyRunnable2(c2));
        Thread t11 = new Thread(new MyRunnable2(c2));
        Thread t12 = new Thread(new MyRunnable2(c2));
        Thread t13 = new Thread(new MyRunnable2(c2));
        Thread t14 = new Thread(new MyRunnable2(c2));
        Thread t15 = new Thread(new MyRunnable2(c2));

        t10.start();
        t11.start();
        t12.start();
        t13.start();
        t14.start();
        t15.start();

        t10.join();
        t11.join();
        t12.join();
        t13.join();
        t14.join();
        t15.join();

    }
}

class Count {
    int countOne = 0;
    int countTwo = 0;

    void increment() {
        try {
            if (countOne < countTwo)
                System.out.println("Лічильник 2 : " + countTwo +  " більше лічильника 1 : " + countOne);
            else if (countOne > countTwo)
                System.out.println("Лічильник 1 : " + countOne + " більше лічильника 2 : " + countTwo);
            else
                System.out.println("Лічильники однакові");
            countOne += 10;
            Thread.sleep(10);
            countTwo += 20;
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

class MyRunnable implements Runnable {
    Count count;;

    public MyRunnable(Count count) {
        this.count = count;
    }

    @Override
    public void run() {
        count.increment();
    }
}

class MyRunnable2 implements Runnable {
    final Count count;

    public MyRunnable2(Count count) {
        this.count = count;
    }


    @Override
    public void run() {
        synchronized (count) {
            count.increment();
        }
    }
    }

public class Main {
    public static void main(String[] args) {

        VolatileCounter counter = new VolatileCounter();
        class Thread1 extends Thread {

            @Override
            public void run() {
                for (int i = 0; i < 1000; i++) {
                    counter.incrementCounter();
                }
            }
        }
        class Thread2 extends Thread {

            @Override
            public void run() {
                for (int i = 0; i < 1000; i++) {
                    counter.incrementCounter();
                }
            }
        }

        Thread1 thread1 = new Thread1();
        Thread2 thread2 = new Thread2();

        thread1.start();
        thread2.start();
        
        System.out.println("Final count: " + counter.getCounter());
    }
}

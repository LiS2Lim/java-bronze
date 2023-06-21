package Study;

public class Thread extends java.lang.Thread {
    public static void main(String[] args) {
        Thread[] t = {new Thread(), new Thread(), new Thread()};
        System.out.println("Thread study");
        for (Thread x : t) {
            x.start();
        }
//        for (Thread x : t) {
//            try {
//                x.join();
//            } catch (Exception e) { ; }
//        }
        System.out.println("Main is over");
    }

    @Override
    public void run() {
        try {
            for (int i = 0; i < 10; i++) {
                System.out.println("Wait: " + i);
                a(i);
                b(i);
                this.sleep(500);
            }
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public synchronized void a(int i) {
        System.out.println("a is run: " + i);
    }
    public synchronized void b(int i) {
        System.out.println("b is run: " + i);
    }
}

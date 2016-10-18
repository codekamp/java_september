package Hello;

/**
 * Created by cerebro on 18/10/16.
 */
public class Demo implements Runnable {

    volatile public static int abcd;

    public static void main(String[] args) {


        abcd = 10;
        Demo demo1 = new Demo();

        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("aaaaaaaaaa");
            }
        });
        thread.setName("CodeKamp Thread");
        thread.start();


        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("aaaaaaaaaa");
            }
        });
        thread2.setName("CodeKamp Thread");
        thread2.start();

        Demo.countDogs();

    }

    synchronized public static void countDogs() {
        System.out.println(abcd);
        abcd = 20;
        for (int i = 1; i < 200; i++) {
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

//            Runnable var1 = new Runnable() {
//                @Override
//                public void run() {
//                    System.out.println("hello world");
//                }
//            };
//
//            Qwerty var2 = new Qwerty() {
//                @Override
//                public int b(String str) {
//                    return 0;
//                }
//            };
//
//            Demo demo2 = new Demo() {
//                @Override
//                public void run() {
//                    System.out.println("new run function");
//                }
//            };

            Thread currentThread = Thread.currentThread();
            String threadName = currentThread.getName();
            System.out.println(threadName + " Dog " + i);
        }
    }

    public static void countCats() {
        System.out.println(abcd);
        for (int i = 1; i < 100; i++) {
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            Thread currentThread = Thread.currentThread();
            String threadName = currentThread.getName();
            System.out.println(threadName + " Cat " + i);
        }
    }

    @Override
    public void run() {
        System.out.println("new thread started");
        Demo.countCats();


//        if (Thread.currentThread().getName() == "CodeKamp Thread") {
//            Demo.countDogs();
//        } else if (Thread.currentThread().getName() == "Awesome Thread") {
//            Demo.countCats();
//        }
    }
}

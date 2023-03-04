//  Write a Java program that shows thread synchronization

class Display {
    public synchronized void print(String msg) {
        System.out.print("[" + msg);
        try {
            Thread.sleep(1000);

        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("]");// [Hello]
    }
}

class SyncExample extends Thread {
    private Display d;
    private String msg;

    public SyncExample(Display d, String msg) {
        this.d = d;
        this.msg = msg;
    }

    public void run() {
        d.print(msg);
    }
}

class SynchronizationTest {
    public static void main(String[] args) {
        Display d = new Display();
        SyncExample t1 = new SyncExample(d, "Hello");
        SyncExample t2 = new SyncExample(d, "World");
        t1.start();
        t2.start();

    }
}

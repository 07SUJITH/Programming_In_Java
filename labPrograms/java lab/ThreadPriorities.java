class WorkerThread extends Thread {
    private int count;

    public WorkerThread(int count) {
        this.count = count;
    }

    public void run() {
        for (int i = 0; i < count; i++) {
            System.out.println(getName() + ": " + i);
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}

public class ThreadPriorities {
    public static void main(String[] args) {
        System.out.println("Main thread starting");

        WorkerThread worker1 = new WorkerThread(10);
        worker1.setName("Worker 1");
        worker1.setPriority(Thread.MIN_PRIORITY);

        WorkerThread worker2 = new WorkerThread(10);
        worker2.setName("Worker 2");
        worker2.setPriority(Thread.NORM_PRIORITY);

        WorkerThread worker3 = new WorkerThread(10);
        worker3.setName("Worker 3");
        worker3.setPriority(Thread.MAX_PRIORITY);

        worker1.start();
        worker2.start();
        worker3.start();
        System.out.println("Main thread ending");
    }
}

// Write a Java program to create two threads: One for displaying all odd number between 1 
// and 100 and second thread for displaying all even numbers between 1 and 100
public class MultithreadedProgram {
    public static void main(String[] args) {
        OddThread oddThread = new OddThread();
        EvenThread evenThread = new EvenThread();

        oddThread.start();
        evenThread.start();
    }
}

class OddThread extends Thread {
    public void run() {
        for (int i = 1; i <= 10; i = i + 2)
            System.out.println("OddThread: " + i);
    }
}

class EvenThread extends Thread {
    public void run() {
        for (int i = 2; i <= 10; i = i + 2)
            System.out.println("EvenThread: " + i);
    }
}


/*
 Write a Java program that implements a multi-threaded program which has three threads. 
First thread generates a random integer every 1 second. If the value is even, second 
thread computes the square of the number and prints. If the value is odd the third thread 
will print the value of cube of the number. 
 */
import java.util.Random;

class EvenThread extends Thread {
    int num;

    EvenThread(int num) {
        this.num = num;
    }

    public void run() {
        System.out.println("square of " + num + " = " + num * num);
    }
}

class OddThread extends Thread {
    int num;

    OddThread(int num) {
        this.num = num;
    }

    public void run() {
        System.out.println("cube of " + num + " = " + num * num * num);
    }
}

class RandomThread extends Thread {
    int num;
    Random r = new Random();

    public void run() {
        for (int i = 0; i < 10; i++) {
            num = r.nextInt(0, 100);
            if (num % 2 == 0)
                new EvenThread(num).start();
            else
                new OddThread(num).start();
        }
    }
}

public class MultithreadedProgram2 {
    public static void main(String[] args) {
        RandomThread rt = new RandomThread();
        rt.start();
    }
}

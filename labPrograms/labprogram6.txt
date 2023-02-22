import java.util.Random;

class FactorialThread extends Thread {
    int number;

    FactorialThread(int number) {
        this.number = number;
    }

    public int factorial(int num) {
        if (num == 1)
            return 1;
        int fact = num * factorial(num - 1);
        return fact;
    }

    public void run() {
        System.out.println("factorial of " + number + " = " + this.factorial(number));
        this.factorial(number);
    }
}

class CubeThread extends Thread {
    int number;

    CubeThread(int number) {
        this.number = number;
    }

    public void run() {
        System.out.println("cube of " + number + " = " + number * number * number);
    }
}

class RandomThread extends Thread {
    Random r = new Random();
    int number;

    public void run() {
        for (int i = 0; i < 10; i++) {
            number = r.nextInt(60);
            if ((number > 1) && (number < 20))
                new FactorialThread(number).start();
            else
                new CubeThread(number).start();
        }
    }
}

public class MultipleThread {
    public static void main(String[] args) {
        RandomThread thread = new RandomThread();
        thread.start();
    }
}


/*
Write a Java program that implements a multi-threaded program which has three threads.
First thread generates a random integer every 1 second. If the value is even, second
thread computes the square of the number and prints. If the value is odd the third thread
will print the value of cube of the number
*/import java.util.Random;
class EvenThread extends Thread{
	private int num;
	public EvenThread(int num){
	    this.num = num;
	}
	public void run(){
	    System.out.println("Square of"+ num+" = "+num*num);
	}
}

class OddThread extends Thread{
	private int num;
	public OddThread(int num){
	   this.num = num;
	}
	public void run(){
	   System.out.println("Cube of "+num+" = "+num*num*num);
	}
}
  
class RandomThread extends Thread{
	public void run(){
	  Random r = new Random();
	  for(int i =0;i<10;i++){
	      int num = r.nextInt(100);
	      if(num % 2 == 0)
	          new EvenThread(num).start();
	      else
          	new OddThread(num).start();
	    }
	} 
}

class TestMultithread{
	public static void main(String args[]){
		RandomThread r = new RandomThread();
		r.start();
	}
}

/*

output

Cube of 97 = 912673
Square of0 = 0
Cube of 27 = 19683
Cube of 11 = 1331
Square of34 = 1156
Cube of 21 = 9261
Square of72 = 5184
Cube of 33 = 35937
Square of32 = 1024
Cube of 77 = 456533

1.Create a RandomThread class that extends the Thread class.
2.In the run method of the RandomThread class, create a new Random object.
3.In a loop with 10 iterations, generate a random integer between 0 and 99 
  using the nextInt method of the Random object.
4.If the random integer is even, create a new EvenThread object with 
  the random integer as the argument and start the thread.
5.If the random integer is odd, create a new OddThread object with the
  random integer as the argument and start the thread.
6.In the run method of the EvenThread class, print the square of the 
  number passed to the constructor.
7.In the run method of the OddThread class, print the 
  cube of the number passed to the constructor.
8.In the main method of the TestMultithread class, 
  create a new RandomThread object and start it.

*/

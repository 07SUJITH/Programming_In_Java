
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

Cube of 71 = 357911
Cube of 39 = 59319
Square of14 = 196
Square of18 = 324
Cube of 51 = 132651
Square of8 = 64
Square of50 = 2500
Square of24 = 576
Square of40 = 1600
Square of78 = 6084

*/

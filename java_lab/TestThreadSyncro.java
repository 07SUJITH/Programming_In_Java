class Display{
	public synchronized void print(String msg){
		System.out.print("["+ msg);
		try{
			Thread.sleep(1000);
		}
		catch(Exception e){
			System.out.println(e.getMessage());
		}
		System.out.println("]");
	}
}

class SyncThread extends Thread{
	private Display d;
	private String msg;
	public SyncThread(Display d,String msg){
	this.d=d;
	this.msg=msg;
	}
	public void run(){
		d.print(msg);	
	}	
} 
class TestThreadSyncro{
	public static void main(String args[]){
		Display d =new Display();
		SyncThread t1 = new SyncThread(d,"Hello");
		SyncThread t2 = new SyncThread(d,"World");
		t1.start();
		t2.start();
	}
}


/*
output

[Hello]
[World]
Algorithm 

1. Create a 'Disply' class that contain a synchronised 'print()' method that takes a string as an 
   argument 
2. In the print() method print the string with brackets around it.
3. sleep the thread for 2 seconds.
4. catch if any exception thrown by the sleep() method and print the exception message.
5. Create a SyncThread class that extends the Tread class and takes a Display object and string as 
   constructor arguments
6. In the run() method of SyncThread class ,call the print method of Display object with string as
   argument
7. In the main() method of TestThreadSynchro class create new Display object and  two 
   SyncThread objects with the Display object and different strings as arguments
8. Start both of the objects of SyncThread class(threads)




*/

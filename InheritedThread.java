/*@Author Falcon
@Created Sun 24 Jun 2018 11:24AM*/

class aThread extends Thread {
	@Override
	public void run() {
		aThread t = new aThread();	// creating a child thread
		System.out.println("Output: "+t.isDaemon());	// checking the property of the 't' thread
	}
}

public class InheritedThread {
	public static void main(String[] args) {
		aThread t1 = new aThread(); // instantiating "aThread" class
		t1.start(); // output: false
		aThread t2 = new aThread(); // instatiating another "aThread" class
		t2.setDaemon(true);	// setting 't2' thread to Daemon Thread
		t2.start();	// output: true
	}
}

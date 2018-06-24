/*
 * @Author Falcon
 * @Created Sat 23 Jun 2018 2:03AM
*/
class UserThread extends Thread {
	@Override
	public void run() {
		for(int i=0; i<1000; i++)
			System.out.println("This is a Thread");
	}
}

public class setDaemon {
	public static void main(String[] args) {	// main thread is a user thread
		UserThread t = new UserThread(); // t is a user thread inherited from its parent main thread
		t.setDaemon(true);	// now t became a daemon thread 
		t.start();
	}
}

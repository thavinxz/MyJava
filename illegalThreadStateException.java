/*
 * @Author Falcon
 * @Created Sat 23 Jun 2018 2:44AM
*/

class UserThread extends Thread {
	@Override 
	public void run() {
		System.out.println("This is a thread");
	}
}

public class illegalThreadStateException {
	public static void main(String[] args) {	// main thread(user thread)
		UserThread t = new UserThread();	// creating a thread (user thread)
		t.start();	// starting the thread
		t.setDaemon(true);	// trying to change a user thread "t" to daemon thread
	}
}

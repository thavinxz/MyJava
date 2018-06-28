/*
 * @Autho Falcon 
 * @Created Fri 22 Jun 2018 10:38PM 
*/

public class daemonThread {
	public static void main(String args[]) {
		Thread t = new Thread() { 	// creating a new user thread(inherited user thread from its parent -- main thread
			@Override
			public void run() {	// overriding run method 
				try {
					int i=0;
					while(true) {
						Thread.sleep(1000);
						System.out.println("i="+i);
						i++;
					}
				}catch(Exception e) {
					System.out.println(e.getMessage());
				}
			}
		};
		System.out.println("Start");
		t.setDaemon(true);	// changing thread as daemon from it inherited state -- user thread
		t.start();	// stating the thread
		System.out.println("End");
	}
}

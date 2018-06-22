/*
 * @Autho Falcon 
 * @Created Fri 22 Jun 2018 10:38PM 
 */

public class daemonThread {
	public static void main(String args[]) {
		Thread t = new Thread() {
			@Override
			public void run() {
				int i=0;
				while(true) {
					System.out.println("i="+i);
					i++;
				}
			}
		};
		System.out.println("Start");
		t.setDaemon(true);
		t.start();
		System.out.println("End");
	}
}

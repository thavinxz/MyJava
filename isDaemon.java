/*@Author Falcon
@Created Sun 24 Jun 2018 12:35 AM*/

class IsDaemon {
	public static void main(String args[]) {
		Thread t = new Thread() { // this is a user thread
			@Override
			public void run() {
				for(int i=0; i<1000; i++) {
					System.out.print("This a thread"); 
				}
			}
		};
		System.out.println(t.isDaemon()); // output: false
		t.setDaemon(true);	// change "t" to daemon thread
		System.out.println(t.isDaemon()); // output: true
	}
}	

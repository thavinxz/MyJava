/*
* @Author Falcon
* @Created Fri 22 Jun 2018 10:24PM
*/

class userThread {
	public static void main(String[] args) {	// main method is a user thread
		Thread t = new Thread() {	// create a new thread obj (inherited user thread from its parent -- main thread)
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
		t.start(); // starting the user thread
		System.out.println("End");
	}
}

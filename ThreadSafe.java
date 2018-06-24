/*
 * @Author Falcon
 * @Created Sun 24 Jun 2018 7:33PM
 */

public class ThreadSafe {
	static int count=0;
	public static void increase() {
		count++;
	}
	public static void main(String[] args) {
		Thread t1 = new Thread(() -> {	// quick way to create a thread using anonymous class
   			for(int i=0; i<1000; i++) increase();
   			
		});
		
		Thread t2 = new Thread(new Runnable() { // another way but same thing
			@Override
			public void run() {
				for(int i=0; i<1000; i++) increase();
			}
		});

		t2.start();	// thread activating
		t1.start();
		
		try {
			t1.join(); // waiting for each other to complete their tasks
			t2.join();
		} catch(InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("Count="+count);
	}
}

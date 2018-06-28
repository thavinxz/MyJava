/*
@Author Falcon
@Created Mon 25 Jun 2018 10:12PM
*/

import java.util.concurrent.atomic.AtomicInteger;

public class AtomicOps {
	static AtomicInteger count = new AtomicInteger(); // creating an obj of AtomicInteger class
	public static void increase() {
		count.getAndIncrement(); // Atomic operation "cout++"
	}
	
	public static void main(String[] args) {
		Thread t1 = new Thread(() -> {
			for(int i=0; i<1000; i++) increase();
		});
		
		Thread t2 = new Thread(new Runnable() {
			@Override
			public void run() {
				for(int i=0; i<1000; i++) increase();
			}
		});
		
		t1.start(); // activating thread
		t2.start();
		
		try {
			t1.join(); // waiting for each thread to complete
			t2.join();
		} catch(InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Count="+count.get()); // get value from the Atomic wrapper class obj "count"
	}
}
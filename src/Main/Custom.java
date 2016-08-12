package Main;

import java.util.concurrent.atomic.AtomicInteger;

public class Custom implements Runnable {
	
	Custom(String str) {
		this.str = str;
	}
	String str;
	
	public static final Object Lock = new Object();

	
	static AtomicInteger ai = new AtomicInteger(0);
	
	@Override
	public void run() {

			int i=0;
			while (i<=10_000) {
				
				synchronized (Lock){
					
			if(Thread.currentThread().getName().equals("Thread-0") && ai.get()%3 == 0){
				System.out.println(str);
				ai.incrementAndGet();
				i++;
				
			}else if(Thread.currentThread().getName().equals("Thread-1") && ai.get()%3 == 1){
				System.out.println(str);
				ai.incrementAndGet();
				i++;
				
			}else if(Thread.currentThread().getName().equals("Thread-2") && ai.get()%3 == 2){
				System.out.println(str);
				ai.incrementAndGet();
				i++;
			}

		
		}
		}
		
	}
}

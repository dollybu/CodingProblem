package com.thread;

public class PrintNaturalNumber implements  Runnable {
	
	public static int number=1;
    static  Object lock=new Object();
    int range =100;
	int reminder;
	
	
	
	@Override
	public void run() {

		
		//synchronized (lock) {
			
			while(number<range) {
			/*while(number %3!=reminder)
			{
				
		     try {
				lock.wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			}*/
			System.out.println(number);
			number++;
           // lock.notifyAll();
			
			}
			
			
		//}
		
		
		
	}


	/*@Override
	public void run() {

		
		synchronized (lock) {
			
			while(number<range) {
			while(number %3!=reminder)
			{
				
		     try {
				lock.wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			}
			System.out.println(number);
			number++;
            lock.notifyAll();
			
			}
			
			
		}
		
		
		
	}*/

	
	
	
	
	public PrintNaturalNumber(int reminder)
	{
		this.reminder=reminder;
	}
		

	
	
	
	
	public static void main(String[] args) {
		
		PrintNaturalNumber t1 =new PrintNaturalNumber(1);
		PrintNaturalNumber t2 =new PrintNaturalNumber(2);
		PrintNaturalNumber t3 =new PrintNaturalNumber(0);
           Thread test1= new Thread(t1);
           test1.start();
           Thread test2= new Thread(t2);
           test2.start();
           
           Thread test3= new Thread(t3);
           test3.start();
           
           
		
			
		
	};
       
        
		
		
		
		
	}



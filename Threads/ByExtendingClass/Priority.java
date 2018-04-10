class ThreadDemo extends Thread
{
	public void run()
	{
		try
		{

			for (int i=0;i<5 ;i++ ) {
			Thread.sleep(1000);
			System.out.println(i+":"+Thread.currentThread().getName());	
			}
			
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}


class Priority
{
	public static void main(String[] args) {
		
		ThreadDemo td=new ThreadDemo();
		ThreadDemo td1=new ThreadDemo();
		ThreadDemo td2=new ThreadDemo();
		td.setPriority(Thread.MAX_PRIORITY);
		td1.setPriority(Thread.MIN_PRIORITY);
		td2.setPriority(Thread.NORM_PRIORITY);
		
		td.start();
		td1.start();
		td2.start();
	}
}
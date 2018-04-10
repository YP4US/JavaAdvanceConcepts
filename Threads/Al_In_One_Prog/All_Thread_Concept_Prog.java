class ThreadDemo extends Thread implements Runnable 
{
	public void run()
	{
		try
		{
			if(Thread.currentThread().isDaemon())
			{
				System.out.println("Deamon Thread Running:"+Thread.currentThread().getName()+"Thread Id is:"+Thread.currentThread().getId());		
			}
			else
			{
				System.out.println("User Thread Running:"+Thread.currentThread().getName()+"Thread Id is:"+Thread.currentThread().getId());						
			}

		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}

class All_Thread_Concept_Prog
{
	public static void main(String[] args) {
		ThreadDemo td=new ThreadDemo();
		//creating thread group
		ThreadGroup tg=new ThreadGroup("Parent_Thread");
		//Creating worker threads
		Thread t1=new Thread(tg,td,"Thread_Worker_one");
		Thread t2=new Thread(tg,td,"Thread_Worker_two");
		Thread t3=new Thread(tg,td,"Thread_Worker_three");
		//creating Daemon thread
		t1.setDaemon(true);
		//assigning priorities to threads
		t1.setPriority(Thread.MIN_PRIORITY);
		t2.setPriority(Thread.NORM_PRIORITY);
		t3.setPriority(Thread.MAX_PRIORITY);
		//starting Threads
		t1.start();
		t2.start();
		t3.start();
		//getting group name
		System.out.println("Name of Master Thread is:"+tg.getName());
		//getting Worker_Threadgrop_info
		tg.list();
	}
}
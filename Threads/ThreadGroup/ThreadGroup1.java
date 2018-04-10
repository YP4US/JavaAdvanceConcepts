class ThreadDemo implements Runnable
{
	public void run()
	{
		try
		{
			System.out.println("Thread Name is:"+Thread.currentThread().getName());
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}

}


class ThreadGroup1
{
	public static void main(String[] args) {
		ThreadDemo td=new ThreadDemo();
		ThreadGroup tg=new ThreadGroup("ParentThread");
			Thread t1=new Thread(tg,td,"First_Worker_Thread");
			Thread t2=new Thread(tg,td,"Second_Worker_Thread");
			Thread t3=new Thread(tg,td,"Third_Worker_Thread");
		t1.start();
		t2.start();
		t3.start();
		System.out.println("Parent Thread Name is:"+tg.getName());
	}
}
class ThreadDemo extends Thread
{
	public void run()
	{
		try
		{
			if(Thread.currentThread().isDaemon())			//Check Daemon
			{
				System.out.println("Daemon Thread is runnning....");
			}
			else
			{
				System.out.println("User Thread is runnning....");	
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}


class DaemonThread
{
	public static void main(String[] args) {
		ThreadDemo td=new ThreadDemo();
		ThreadDemo td1=new ThreadDemo();
		td.setDaemon(true);					//set Daemon
		td.start();
		td1.start();
	}
}
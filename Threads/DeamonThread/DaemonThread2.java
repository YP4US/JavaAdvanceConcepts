class ThreadDemo extends Thread
{
	public void run()
	{
		try
		{
			if (Thread.currentThread().isDaemon()) {
				System.out.println("Running Daemon Thread:"+Thread.currentThread().getName());
			}
			else
			{
				System.out.println("Running user Thread:"+Thread.currentThread().getName());
			}

		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}


class DaemonThread2
{
	public static void main(String[] args) {
		ThreadDemo td=new ThreadDemo();
		ThreadDemo td2=new ThreadDemo();
		td2.setDaemon(true);
		td2.setName("Deamon");
		td.setName("Stefin");
		td.start();
		td2.start();
	}
}
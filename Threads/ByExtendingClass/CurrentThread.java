class ThreadDemo extends Thread
{
	public void run()
	{
		try
		{
			String currentThreadName=Thread.currentThread().getName();
			System.out.println("Hello Mr. Root!!! current thread name is:"+currentThreadName);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}


class CurrentThread
{
	public static void main(String[] args) {
		ThreadDemo td=new ThreadDemo();
		ThreadDemo td1=new ThreadDemo();

		td.start();
		td1.start();
	}
}
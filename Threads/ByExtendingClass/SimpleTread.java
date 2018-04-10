class ThreadDemo extends Thread
{
	public void run()
	{
		System.out.println("Running Thread");
	}
}

class SimpleThread
{
	public static void main(String[] args) {
		ThreadDemo td=new ThreadDemo();
		td.start();
	}
}
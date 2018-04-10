class ThreadDemo implements Runnable
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
		Thread t1=new Thread(td);
		t1.start();
	}
}
/*
//Thread by extending thread class
class ThreadData extends Thread
{
	public void run()
	{
		try
		{	
			Thread.sleep(500);
			System.out.println("Thread Running by extending Thread class...");

		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}


class ThreadExample
{
	public static void main(String[] args) {
		ThreadData td=new ThreadData();
		td.start();	
	}
}

*/

class ThreadData implements Runnable
{
	public void run()
	{
		try
		{
			Thread.sleep(500);
			System.out.println("Thread Running by implementing runnable interface...");
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}

class ThreadExample
{
	public static void main(String[] args) {
		ThreadData td=new ThreadData();
		Thread t1=new Thread(td);
		t1.start();
	}
}
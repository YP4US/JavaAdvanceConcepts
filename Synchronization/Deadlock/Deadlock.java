class Thread1 extends Thread
{
	public void run(String a,String b)
	{
		synchronized (this.a)
		{
			System.out.println("Thread1: locked a"); 
		}
		try
		{
			Thread.sleep(600);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}

		synchronized (this.b)
		{
			System.out.println("Thread1: locked b");
		}

	}

}

class Thread2 extends Thread
{
	public void run(String a,String b)
	{
		synchronized (this.b)
		{
			System.out.println("Thread2: locked b");
		}
		try
		{
			Thread.sleep(600);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}

		synchronized (this.a)
		{
			System.out.println("Thread2: locked a");
		}

	}
}


class Deadlock
{
	public static void main(String[] args) {
		final  String a= "Mr.";
		final  String b= "Root";
		Thread1 th1=new Thread1();
		Thread2 th2=new Thread2();
		th1.start(a,b);
		th2.start(a,b);
		
	}
}
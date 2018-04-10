//DeadLock in synchronized methods
class Table
{
	synchronized public void method1()
	{
		try
		{
			System.out.println(Thread.currentThread().getName()+"Locked and Running Method1");
			Thread.sleep(600);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}

	}

	synchronized public void method2()
	{
		try
		{
			System.out.println(Thread.currentThread().getName()+"Locked and Running Method2");
			Thread.sleep(600);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
	
}

class Thread1 extends Thread
{
	Table t1;
	Thread1(Table t1)
	{
		this.t1=t1;
	}
	public void run()
	{
		try
		{
			t1.method1();
			Thread.sleep(600);
			t1.method2();	
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		
	}
}

class Thread2 extends Thread
{
	Table t1;
	Thread2(Table t1)
	{
		this.t1=t1;
	}
	public void run()
	{
		try
		{
			t1.method2();
			Thread.sleep(600);
			t1.method1();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}

	
}


class Dead_Lock
{
	public static void main(String arg[])
	{
		Table tb=new Table();
		Thread1 th1=new Thread1(tb);
		Thread2 th2=new Thread2(tb);
		th1.start();
		th2.start();
	}
}
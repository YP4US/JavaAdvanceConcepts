class Table
{
	synchronized public void printTable(int n)
	{
		for (int i=0;i<5 ;i++ ) 
		{
			
			System.out.println(i*n);


			try
			{
				Thread.sleep(500);
			}
			
			catch(Exception e)
			{
				System.out.println(e);
			}
	  	}

		
	}
}


class Thread1 extends Thread
{
	Table t;
	Thread1(Table t)
	{
		this.t=t;
	}

	public void run()
	{
		t.printTable(5);
	}
}


class Thread2 extends Thread
{
	Table t2;
	Thread2(Table t2)
	{
		this.t2=t2;
	}

	public void run()
	{
		t2.printTable(100);
	}

}


class TestSynchronization
{
	public static void main(String[] args) {
		Table tb=new Table();
		Thread1 th1=new Thread1(tb);
		Thread2 th2=new Thread2(tb);
		th1.start();
		th2.start();
	}
}
class Table
{
	synchronized public void printTable(int n)
	{
		for (int i=1;i<6 ;i++ ) 
		{
			try
			{
				System.out.println(i*n);
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
	Table t1;
	Thread1(Table t1)
	{
		this.t1=t1;
	}
	public void run()
	{
		t1.printTable(15);
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


class TestSynchronization1
{
	public static void main(String[] args) {
		Table tb= new Table();
		Thread1 th1=new Thread1(tb);
		Thread2 th2=new Thread2(tb);
		th1.start();
		th2.start();
	}
}
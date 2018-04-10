class ThreadDemo extends Thread
{
	public void run()
	{
		try{
			Thread.sleep(500);						/*optional*/
			for (int i=0;i<5 ;i++ ) {
				System.out.println(i);
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}

class Join
{
	public static void main(String[] args) {
		ThreadDemo td=new ThreadDemo();
		td.start();
		try
		{
			td.join(2000);								/*Can also keep empty*/
		}
		catch(Exception e1)
		{
			System.out.println(e1);
		}
		ThreadDemo td1=new ThreadDemo();
		ThreadDemo td2=new ThreadDemo();
		td1.start();
		td2.start();
	}
}
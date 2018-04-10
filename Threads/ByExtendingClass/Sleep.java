class ThreadDemo extends Thread
{
	public  void  run()
	{
		for (int i=0;i<5 ;i++ ) {
			try{
				Thread.sleep(2000);
				System.out.println(i);
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
		}
		
	}
}

class Sleep
{
	public static void main(String[] args) {
		
		ThreadDemo td=new ThreadDemo();
		td.start();
		

	}
}
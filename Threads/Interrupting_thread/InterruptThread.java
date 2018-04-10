//handling intrrupt in thread class(It will allow to run thread still after interrupt)
class Thread1 extends Thread
{
	public void run()
	{
		try
		{
			Thread.sleep(500);
			
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		System.out.println("Thread still running....");

	}
}






class InterruptThread
{
	public static void main(String[] args) {
		Thread1 t1=new Thread1();
		t1.start();
		t1.interrupt();

	}
}
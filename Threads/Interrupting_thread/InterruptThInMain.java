//handling intrrupt in main class( will not allow to run thread after interrupt)
class Thread1 extends Thread
{
	public void run()
	{
		
		Thread.sleep(500);	
		
		System.out.println("Thread still running after interrupt...");
	}

}


class InterruptThInMain
{
	public static void main(String[] args) {
		Thread1 t1=new Thread1();
		t1.start();
		try
		{
			t1.interrupt();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}
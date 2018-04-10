class ThreadDemo
{
	public void yp()
	{
		System.out.println("Running yp method");
	}

	public void root()
	{
		yp();
		System.out.println("Running root method");
	}


}


class ReuseMethodInThread
{

	public static void main(String[] args) {
		ThreadDemo td=new ThreadDemo();
		new Thread(){

			public void run()
		    {
		    	td.root();
		    }
		}.start();
		
	}
}
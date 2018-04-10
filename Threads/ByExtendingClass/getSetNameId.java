class ThreadDemo extends Thread
{
	public void run()
	{
		try
		{
			System.out.println("Hi Mr. Root");
		}
		catch(Exception e)
		{
			System.out.println(e);
		}

	}
}


class getSetNameId
{
	public static void main(String[] args) {
		ThreadDemo td=new ThreadDemo();
		ThreadDemo td1=new ThreadDemo();

		System.out.println("Original thread names:");
		//get name
		System.out.println("Thread t1 Name:"+td.getName());
		System.out.println("Thread t1 Name:"+td1.getName());
		//set name
		System.out.println("After giving thread names:");
		td.setName("Root");
		td1.setName("Love");
		System.out.println("Thread t1 Name:"+td.getName());
		System.out.println("Thread t1 Name:"+td1.getName());
		//get id
		System.out.println("Thread Id's:");
		
		System.out.println("Thread t1 id:"+td.getId());
		System.out.println("Thread t1 id:"+td1.getId());
	}
}
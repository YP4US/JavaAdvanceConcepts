class Shutdown
{
	public static void main(String[] args) {
		try
		{
			//use -s switch to shutdown system, -r switch to restart system and -t switch to specify time delay.
			Runtime.getRuntime().exec("c:\\Windows\\System32\\shutdown -s -t 0");  
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}
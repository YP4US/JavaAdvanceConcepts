class AvilProcessor
{
	public static void main(String[] args) {
		try
		{
			int a=Runtime.getRuntime().availableProcessors();
			System.out.println("No of Processors available are:"+a);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
	
}
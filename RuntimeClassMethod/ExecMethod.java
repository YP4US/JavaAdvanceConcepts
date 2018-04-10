class ExecMethod
{
	public static void main(String[] args) {
		try
		{
			
			Runtime.getRuntime().exec("notepad"); //will open notepad
			//Runtime.getRuntime().exec("calc"); //will calculator
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}
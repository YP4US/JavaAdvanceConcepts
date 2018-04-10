import java.io.*;
class ConsoleInOut
{
	public static void main(String[] args) {
		System.out.println("Enter your Name:");
		String msg=System.console().readLine();		//one way to define console class
		System.out.println("Hello "+msg);
		Console c=System.console();					//other way to define console class
		System.out.println("Enter your password.");
		char pass[]=c.readPassword();				//readPassword only takes char value
		String pwd=String.valueOf(pass);			//convert to string
		System.out.println("Your Password is:"+pwd);

	}
}
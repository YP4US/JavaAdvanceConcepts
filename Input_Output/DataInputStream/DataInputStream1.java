import java.io.*;
class DataInputStream1
{
	public static void main(String[] args) throws Exception {
		FileInputStream fis=new FileInputStream("file.txt");
		DataInputStream dis=new DataInputStream(fis);
		int i=0;
		while((i=dis.read())!=-1)
		{
			System.out.print((char)i+"-");
		}
		dis.close();
		fis.close();
		System.out.println("\nRead Completed.");
		
	}
}
//write common data(string) to multiple file
import java.io.*;
class ByteArrayOutputStream1
{
	public static void main(String[] args) throws Exception{
		FileOutputStream fos1=new FileOutputStream("file1.txt");
		FileOutputStream fos2=new FileOutputStream("file2.txt");
		ByteArrayOutputStream baos=new ByteArrayOutputStream();
		String msg="I am Yogesh Pawar.";
		byte b[]=msg.getBytes();
		baos.write(b);
		baos.writeTo(fos1);
		baos.writeTo(fos2);
		baos.flush();
		fos1.close();
		fos2.close();
		
	}
}
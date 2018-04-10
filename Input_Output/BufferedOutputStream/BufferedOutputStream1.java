import java.io.*;
class BufferedOutputStream1
{
	public static void main(String[] args) throws Exception {

			FileOutputStream fos=new FileOutputStream("file.txt");
			BufferedOutputStream bos=new BufferedOutputStream(fos);
			String msg="Hello Mr. Root...";
			byte b[]=msg.getBytes();
			bos.write(b);
			System.out.println("Write completed.");
			bos.flush();
			bos.close();
			fos.close();


	}

}
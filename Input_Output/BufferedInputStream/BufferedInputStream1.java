import java.io.*;
class BufferedInputStream1
{
	public static void main(String[] args) throws Exception {
		FileInputStream fis=new FileInputStream("file.txt");
		BufferedInputStream bis=new BufferedInputStream(fis);
		int i=0;
		while((i=bis.read())!=-1)
		{
			System.out.print((char)i);
		}
		//bis.flush();
		bis.close();
		fis.close();
	}

}
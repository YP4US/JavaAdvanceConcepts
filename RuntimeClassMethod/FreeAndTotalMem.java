class FreeAndTotalMem
{
	public static void main(String[] args) {
		try
		{
			Runtime r=Runtime.getRuntime();
			System.out.println("Total Memory:"+r.totalMemory());	//total memory
			System.out.println("Free Memory:"+r.freeMemory());		//free memory

			for (int i=0;i<10000 ;i++ ) {
				new FreeAndTotalMem();
			}

			System.out.println("After creating 1000 instance free Memory is:"+r.freeMemory());
			//calling garbage colector
			System.gc();
			System.out.println("After collecting garbage free Memory is:"+r.freeMemory());
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}
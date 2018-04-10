class MathMax
{
	public static void main(String[] args) {
		int [] arr1={24,5,8,76,3};
		int [] arr2={45,7,86,23};
		int result=0;
		for (int i=0;i<5 ;i++ ) {
			for (int j=0;j<4;j++ ) {
				result= Math.max(i,j);
			}
			System.out.println("Maximum no is:"+result);
		}
		
	}
}


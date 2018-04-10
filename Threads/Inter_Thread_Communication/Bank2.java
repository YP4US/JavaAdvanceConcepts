class Customer
{
	int amount=10000;
	synchronized public void withdraw(int amount)
	{
		System.out.println("withdraw initiated...");
		if(this.amount<amount)
		{
			System.out.println("insuffitiant amount..Waiting for deposit...");
			try
			{
				Thread.sleep(1500);
				wait();
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
			this.amount -=amount;
			System.out.println("Current balance is:"+this.amount);
		}
	}
	
	synchronized public void deposit(int amount)
	{
		System.out.println("depositing amount.....");
		try{Thread.sleep(1500);}catch(Exception e){}
		this.amount +=amount;
		System.out.println("Amount deposited:"+amount);
		notify();
	} 	
				
	

}


class Bank2
{
	public static void main(String[] args) {
		Customer c1=new Customer();
		new Thread(){
			public void run()
			{
				c1.withdraw(15000);
			}
		}.start();

		new Thread()
		{
			public void run()
			{
				c1.deposit(10000);
			}
		}.start();
	}
}
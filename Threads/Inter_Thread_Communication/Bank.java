class Customer
{
	int amount=10000;
	synchronized public void deposit(int amount)
	{
		System.out.println("Depositing amount....");
		this.amount+=amount;
		notify();
	}


			synchronized public void withdraw(int amount)
			{
				if(this.amount<amount)
				{
					System.out.println("Balance is Low. Waiting for deposit");
					try
					{
						wait();
					}
					catch(Exception e)
					{
						System.out.println(e);
					}
					
				}
				this.amount -=amount;
				System.out.println("withdraw completed....");
				System.out.println("Current balance is...."+this.amount);

				
			}


}

class Bank
{
	public static void main(String[] args) {
		Customer c1=new Customer();
		new Thread(){
			public void run()
			{
				c1.withdraw (15000);
			}
		}.start();

		new Thread(){
			public void run()
			{
				c1.deposit(10000);
			}
		}.start();
	}
}
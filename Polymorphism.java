class Bank
{
	float getRateOfInterest()
	{
		return 0;
	}
}

class SBI extends Bank
{
	float getRateOfInterest()
	{
		return 7.1f;
	}
}

class ICICI extends Bank
{
	float getRateOfInterest()
	{
		return 8.1f;
	}
}

class Axis extends Bank
{
	float getRateOfInterest()
	{
		return 9.1f;
	}
}

class Polymorphism
{
	public static void main(String[] args) {
		Bank b;
		b=new SBI();
		System.out.println("SBI IR is:"+b.getRateOfInterest());
		b=new ICICI();
		System.out.println("ICICI IR is:"+b.getRateOfInterest());
		b=new Axis();
		System.out.println("Axis IR is:"+b.getRateOfInterest());

	}
}
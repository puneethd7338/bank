class Bank
{
	void calculate_interst(double amout)
		{
			double In=amout*0.04;
			System.out.println("Savings account Interst of the amout is:"+In);
		}
	void calculate_interst(double amout, int rate)
		{
			double In=amout*rate;
			System.out.println(" custom rate Interst of the amout is:"+In);
		}
	void calculate_interst(double amout, int rate ,int term)
		{
			double In=(amout * Math.pow((1+rate/100),term))-amout;
			System.out.println("Interst of the Fixed deposited amout is:"+In);
		}
}

public class MethodOverloding
{
	public static void main(String[]args)
	{
		Bank b=new Bank();
		b.calculate_interst(10000.00);
		b.calculate_interst(10000,6);
		b.calculate_interst(10000,5,3);
	}
		
}
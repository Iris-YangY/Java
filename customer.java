class customer
{
	private String name;
	private Purchase[] purchaseHistory;
	private int count = 0;
	int registerdate;
	int VIPpoint;

	public return()
	{
		registerdate = VIPpoint = 365;
	}
	customer(int x, int y)
	{
		registerdate = x;
		VIPpoint = y;
	}

	//constructor for a new purchase
	public customer(String name)
	{
		this.id = id;
		purchaseHistory = new Purchase [100];
	}

	//accessor and mutator
	public class surprise extends customer
	{
		private int birthdate;
		private boolean datefits;
		public surprise()
		{
			birthdate = 0318;
			datefits = true;
		}
		private void celebrate()
		{
			System.out.println("Happy Birthday!");
		}
		public void bless()
		{
			System.out.println("Hope you have a nice day!");
		}
	}
}
class Biggest
{
	public staic void main(String args[])
		{
			int n1=Integer.ParseInt(args[0])
			int n2=Integer.ParseInt(args[1])
			int n3=Integer.ParseInt(args[2])
			if(n1>n2) && (n2>n3)
			{
				System.out.println("Biggest is",n1);

			}
			else if(n2>n1) && (n1>n3)
			{
				System.out.println("Biggest is",n2);
			}
			else
			{
				System.out.println("Biggest is ",n3);
			}
		}
}
		

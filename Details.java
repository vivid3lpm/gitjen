public class Details {
	String sname;
	String email;
	void input()
	{
		Scanner s= new Scanner(System.in);
		System.out.println("enter  name");
		sname=s.next();
		System.out.println("enter email");
		email=s.next();
	}
	void display()
	{
		System.out.println(sname +"  "+ email);
	}
}

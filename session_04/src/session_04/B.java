package session_04;
public class B extends A{
	@Override
	public void m1()
	{
		System.out.println("In m1() of B");
	}
	
	public void m2()
	{
		System.out.println("In m2() of b");
	}

	public static void main(String[] args) {
		A b = new B();
		//System.out.println(b.no);//CTE
		b.getNo();
		b.m1();
		((B) b).m2();
		
		System.out.println(b instanceof A);
		System.out.println(b instanceof B);
		
	}
	
	
}

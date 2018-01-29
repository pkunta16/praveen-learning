class Test 
{
	static int a=1000;
	static int b=2000; 
	public static void main(String[] args)
	{
		System.out.println(Test.a);
		System.out.println(Test.b);
		Test t= new Test();
		t.m1();
		
	}
	void m1()
	{
		System.out.println(Test.a);
		System.out.println(Test.b);
	}
}

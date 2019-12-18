
public class Testconstructor {

	public static void main(String[] args) {
		
		A obj=new A();
		B obj1=new B();

	}

}

class A {
	
	 A() 
	{
		System.out.println("Calling Constructor A");
	}
	
	
}



class B extends A { 
	
	B() 
	{
		System.out.println("Calling Constructor B");
	}
	
	
}

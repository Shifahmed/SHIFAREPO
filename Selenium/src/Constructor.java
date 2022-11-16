
public class Constructor {
	int a;
	int b;
	int c;
	int d;
	
	public Constructor(int a, int b,int c)
	{
		
		System.out.println("Print 3 parameterized constructor");
		
	}
	public Constructor()
	{
		
	System.out.println("Print Default constructor");
	}
	
	public  Constructor(int a , int b )
	{
		this();
	System.out.println("Print 2 parameterized constructor");
	
}
public Constructor(int a ,int b ,int c ,int d)
{
	System.out.println("Print 4 parameterized constructor");
}
public Constructor(int a )
{
	
	System.out.println("Print 1 parameterized constructor" );
}
public static void main (String[] args) {
Constructor obj=new Constructor(1,2,3);
Constructor obj1=new Constructor(1,2);
Constructor obj2=new Constructor(1,2,3,4);
Constructor obj3=new Constructor(1);



}

}

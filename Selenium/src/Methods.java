
public class Methods {
	int a;
	int b;
	int c;
	int d;
	 public void Method0()
	 {
		 System.out.println("This default method");
		 this.Method1(1);
	 }
	 
public void Method1(int a) {
	
	System.out.println("This is one paramaterised method");
	this.Method2(2,3);
}
public void Method2(int a, int b) {
	
	System.out.println("This is two paramterised method");
	this.Method4(4,5,6,7);
}
public void Method3(int a,int b, int c) {
	
	System.out.println("This is three parametrised method ");
	this.Method0();
}
public void Method4(int a, int b, int c, int d) {
	System.out.println("this is four parametrised method");
}
public static void main(String[] args) {

Methods m=new Methods();
m.Method3( 1,2,3);

}
}

import java.util.Scanner;

public class scannerops {
	int x1;
	int x2;
	int x3;
	int x4;
	int x5;
	int x6;
	public int sum(int x1 ,int x2) {
		int a=x1+x2;
		System.out.println("Adding the sum of two number"+ a);
		return a;
		
	}
	public int sub(int x4, int x3) {
		int b=x4-x3;
	System.out.println("Subtracting the two number"+b);
	return b;
		
	}
	public int mul(int x5, int x6) {
		int c=x5*x6;
		System.out.println("Multiplication of two number"+c);
		 return c;
		
	}
	
    public void div(int x7 ,int x8) {
    	int d=x7/x8;
    	System.out.println("Divison of two numbers"+ d);
    
    	
	
}

public static void main(String args[]) {
	System.out.println("Enter any value for output");
	Scanner s=new Scanner(System.in);
	int x1=s.nextInt();
	int x2=s.nextInt();
	int x3=s.nextInt();
	int x4=s.nextInt();
	int x5=s.nextInt();
	int x6=s.nextInt();
	scannerops sop=new scannerops();
	int sum1=sop.sum(x1,x2);
	int sub2=sop.sub(sum1 ,x3);
	int sum2=sop.sum(sub2,x4);
	int mul1=sop.mul(sum2,x5);
	sop.div(mul1,x6);
	
	
	
	
	
}
}
	

import java.util.Scanner;

import org.openqa.selenium.chrome.ChromeDriver;

import SeleniumPackage.String;


public class Scannerarth {

	int x1;
	int x2;
	int x5;
	int x6;
	

public int sum(int x1,int x2) {
int a=x1+x2;
System.out.println("Addition of two numwber are"+ a);
return a;
}
public int sub(int x3,int x4) {
	int b=x3-x4;
	System.out.println("subtraction of two numwber are"+ b);
	return b;
}
public int mul(int x5,int x6) {
	int c=x5*x6;
	System.out.println("Multiplication of two nubers are"+c);
	return c;
	
}
public int div(int x7 ,int x8) {
	int d=x7/x8;
			System.out.println("Addition of two numwber are"+ d);
	return d;
}
public static void main(String args[]) {
	System.out.println("Enter any number to get desired output");
Scanner s=new Scanner(System.in);
int x1=s.nextInt();
int x2=s.nextInt();
Scannerarth sa=new Scannerarth();
int sub1=sa.sub(x1,x2);
int sum1=sa.sum(sub1,x2);
int mul1=sa.mul(sum1,x2);
int sub2=sa.sub(mul1,x2);
sa.div(sub2,x2);


}




	
}

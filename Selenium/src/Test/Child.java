package Test;

import Student.Parent;

public class Child extends Parent {
	int a;
	int b;
	int c;
	
	public Child() {
		this(99,10);
		System.out.println("This is default child constructor type");	
	}
	public Child(int a) {
   this();
		System.out.println("This is one parametrised child constructor type");
	}
	public Child(int a, int b) {
	super(56,57);
		System.out.println("This is two parametrised child constructor type" );	 
	}
	public Child(int a, int b, int c) {

this(76);
	
System.out.println("This is three parametrised child constructor type");
	}
	

public static void main (String[] args) {	
	Child c1=new Child(45,46);
	Child c2=new Child(66,67,68);
	
}
}

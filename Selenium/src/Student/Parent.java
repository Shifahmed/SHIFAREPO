package Student;

public class Parent {
	int a;
	int b;
	int c;
	
	
	
	 public Parent(){
		 this(13,14,15);
		System.out.println("This is Parent default constructor type");
	}
	public Parent(int a) {
	this();
		System.out.println("This is one parametrised Parent constructor type");
	}
	public Parent(int a, int b) {
		this(12);
		System.out.println("This is two parametrised Parent constructor type");
	}
		public Parent(int a, int b, int c) {
			System.out.println("This is three parametrised Parent constructor type");
	
	}

}

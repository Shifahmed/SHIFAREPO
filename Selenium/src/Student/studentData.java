package Student;

public class studentData {
	int age;
	int rollNo;
	public void display1() {
		System.out.println("Welcome to all of you");
	}
public void display2(){
	System.out.println("automation is very easy");
}
public static void main(String[]args) {
	studentData sd=new studentData();
	sd.age=12;
	System.out.println("Age of student is="+sd.age);
	sd.rollNo=67;
	System.out.println("RollNo of student is="+sd.rollNo);
	sd.display1();
	sd.display2();
			
}

}

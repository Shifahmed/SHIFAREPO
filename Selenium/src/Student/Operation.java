package Student;

public class Operation {
	public int add(int a,int b) {
		int x;
	x=a+b;
	System.out.println("Sum operation"+x);
	return x;
}

   public int sub(int x,int c) {
	   int y;
     y=x-c;
     System.out.println("sub operation="+y);
     return c;
}

   public int sum(int y,int d) {
	   int z;
    z=y+d;
    System.out.println("Sum operation="+z);
    return z;
}
   public int multi(int z,int g) {
	   int w;
    w=z*g;
    System.out.println("multi operation="+w);
    return w;
}

     public void divd(int w,int i) {
    	int v; 
      v=w/i;
  System.out.println("divd operation="+v);
 
     }
     public static void main(String[]args) {
    	 Operation result=new Operation();
    	int addEQ =result. add(10,2);
    	int subEQ=result.sub(addEQ, 2);
        int sumEQ=result.sum(subEQ, 2);
        int mulEQ=result.multi(sumEQ, 2);
   result.divd(mulEQ, 2);
    	 
    	 
    	 
     }
     
}

package week3.day1;

public class Calculator {

	public int add (int a,int b) {
	int	add=a+b;
	return add;			
	}
	public int add (int a ,int b,int c) {
		int add=a+b+c;
		return add;
	
	}
	public int sub(int a,int b) {
		int sub =a-b;
		return sub;
	}
	public double sub(double a,double b) {
		double sub=a-b;
		return sub;
		
	}
	public int mul(int a ,int b) {
		int mul=a*b;
		return mul;
		
	}
	public double mul(double a,int b) {
		double mul=a *b;
		return mul;
	}
	
	
	
 public static void main(String[] args) {
		// TODO Auto-generated method stub
     Calculator cal =new Calculator();
     System.out.println(cal.add(6, 2));
     System.out.println(cal.add(8, 7, 9));
     System.out.println(cal.sub(74, 67));
     System.out.println(cal.sub(8.5, 6.4));
     System.out.println(cal.mul(87, 6));
     System.out.println(cal.mul(7.8, 6));
    
	}

}

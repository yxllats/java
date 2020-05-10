public class TestDemo {
	public static int sum(int x,int y) {
		return x+y;
	}
	
	public static double sum(double x,double y,double z) {
		return x+y+z;
	}
	
	
	public static void main(String[] args) {
		int a=10;
		int b=20;
		double c=15.1;
		double d=20.1;
		double t=20.1;
		int num=sum(a,b);
		System.out.println(num);
		double num2=sum(c,d,t);
		System.out.println(num2);
	}
}
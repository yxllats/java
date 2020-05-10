public class TestDemo {
	public static int max(int x,int y) {
		if(x>y) {
			return x;
		}else {
			return y;
		}
	}
	
	public static double max(double x,double y) {
		if(x>y) {
			return x;
		}else {
			return y;
		}
	}
	
	public static double max(double x,int y) {
		if(x>y) {
			return x;
		}else {
			return (double)y;
		}
	}
		
	public static void main(String[] args) {
		int a=10;
		int b=20;
		double c=15.1;
		double d=20.1;
		int num=max(a,b);
		System.out.println(num);
		double num2=max(c,d);
		System.out.println(num2);
		double num3=max(max(c,d),b);
		System.out.println(num3);
		
	}
}
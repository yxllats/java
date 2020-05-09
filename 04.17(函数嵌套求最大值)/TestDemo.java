public class TestDemo {
	public static int max2(int x,int y) {
		if(x>y) {
			return x;
		}else {
			return y;
		}
	}
	
	public static int max3(int x,int y) {
		if(x>y) {
			return x;
		}else {
			return y;
		}
	}
		
	public static void main(String[] args) {
		int a=10;
		int b=20;
		int c=15;
		int max=max3(max2(a,b),c);
		System.out.println(max);
	}
}
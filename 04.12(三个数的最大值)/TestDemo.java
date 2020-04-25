public class TestDemo {
	public static int maxNum(int a,int b,int c) {
		if(a<b) {
			int temp=b;
			b=a;
			a=temp;
		}
		if(a<c) {
			int temp=c;
			c=a;
			a=temp;
		}
		return a;
	}
	
	public static void main(String[] args) {
		int a=10;
		int b=20;
		int c=5;
		int max=maxNum(a,b,c);
		System.out.println(max);
	}
}
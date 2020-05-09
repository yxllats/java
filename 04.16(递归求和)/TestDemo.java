public class TestDemo {
	public static int num_Sum(int n) {
		if(n==1) {
			return 1;
		}else {
			return n+num_Sum(n-1);
		}
	}
	public static void main(String[] args) {
		int n=10;
		int sum=num_Sum(n);
		System.out.println(sum);
	}
}
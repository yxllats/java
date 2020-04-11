public class Factorial_Sum {
	public static void main(String[] args) {
		int num = 5;
		int i = 1;
		int ret = 1;
		int sum=0;
		while(i <= num) {
			ret *= i;
			sum+=ret;
			i++;
		}
		
		System.out.println(sum);
	}
}
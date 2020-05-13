import java.util.*;

public class TestDemo {
	public static int fact_sum(int n) {
		int sum=0;
		int ret=1;
		for(int i=1;i<=n;i++) {
			ret*=i;
			sum+=ret;
		}
		return sum;
	}
	
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int sum=fact_sum(n);
		System.out.println(sum);
	}
}
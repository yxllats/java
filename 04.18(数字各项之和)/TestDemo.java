import java.util.*;
public class TestDemo {
	public static int numSum(int n) {
		if(n<10) {
			return n;
		}else {
			return n%10+numSum(n/10);
		}
	}
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int sum=numSum(n);
		System.out.println(sum);
	}
}
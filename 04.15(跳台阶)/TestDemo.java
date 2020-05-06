import java.util.*;
public class TestDemo {
	public static int func(int n) {
		if(n==1) {
			return 1;
		}else if(n==2) {
			return 2;
		}else {
			return func(n-1)+func(n-2);
		}
	}
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int sum=func(n);
		System.out.println(sum);
	}
}
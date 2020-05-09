import java.util.*;

public class TestDemo {
	public static void main(String[] args) {
		int a=1;
		int b=1;
		int c=1;
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		for(int i=3;i<=n;i++) {
			c=a+b;
			a=b;
			b=c;
		}
		System.out.println(c);
	}
}
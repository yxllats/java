import java.util.*;
public class TestDemo {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int a=scan.nextInt();
		int b=scan.nextInt();
		int c=b;
		while((a%b)!=0) {
			c=a%b;
			a=b;
			b=c;
		}
		System.out.println("最大公约数是"+c);
	}
}
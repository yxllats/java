import java.util.*;
public class TestDemo {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int num=scan.nextInt();
		int n=0;
		//没考虑判断0
		while(num!=0) {
			num=num&(num-1);
			n++;
		}
		System.out.println(n);
	}
}
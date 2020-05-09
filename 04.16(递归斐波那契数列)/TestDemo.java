import java.util.*;
public class TestDemo {
	public static int getNum(int n) {
		if(n==1) {
			return 1;
		}else if(n==2) {
			return 1;
		}
		else {
			return getNum(n-1)+getNum(n-2);
		}
	}
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int num=getNum(n);
		System.out.println(num);
	}
}
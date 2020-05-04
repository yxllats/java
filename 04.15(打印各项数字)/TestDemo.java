import java.util.*;
public class TestDemo {
	public static void getNum(int n) {
		if(n<10) {
			System.out.print(n+" ");
		}else {
			getNum(n/10);
			System.out.print((n%10)+" ");
		}
	}
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		getNum(n);
	}
}
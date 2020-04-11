import java.util.*;
 
public class TestDemo {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int temp=0;
		while(scan.hasNextInt()) {
		int num = scan.nextInt();
		for(int i=2;i<=(int)Math.sqrt(num);i++) {
			if(num%i==0) {
				temp++;
				break;
			}
		}
		if(temp==1) {
			System.out.println("不是素数");
			temp=0;
		}
		else {
			System.out.println("是素数");
		}
		}
	}
}
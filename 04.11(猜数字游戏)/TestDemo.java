import java.util.*;

public class TestDemo {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		Random random=new Random();
		int randnum=random.nextInt(100);	
		while(true) {	
			System.out.println("请输入数字：");		
			int num=scan.nextInt();
			if(num>randnum) {
				System.out.println("猜大了");
			}
			else if(num<randnum) {		
				System.out.println("猜小了");
			}
			else {
				System.out.println("猜对了");
				break;
			}
		}
	}
}
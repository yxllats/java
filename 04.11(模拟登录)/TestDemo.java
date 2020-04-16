import java.util.*;


public class TestDemo {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int num=3;
		while(num!=0) {
			System.out.println("请输入密码，剩余"+num+"次机会");
			String str=scan.nextLine();
			if(str.equals("232323")) {
				System.out.println("密码正确，登录成功");
				break;
			}
			else {
				System.out.println("密码错误");
				num--;
			}
		}		
	}
}
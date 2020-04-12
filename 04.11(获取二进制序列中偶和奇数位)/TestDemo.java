import java.util.*;

//仅能判断正数
public class TestDemo {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int num=scan.nextInt();
		for(int i=31;i>=1;i-=2) {
			System.out.print(((num>>i)&1)+" ");
		}
		System.out.println();
		for(int i=30;i>=0;i-=2) {
			System.out.print(((num>>i)&1)+" ");
		}
	}
}	
		
		
		
		
		
		
		/*int[] arr=new int[32];
		for(int i=0;i<32;i++) {
			if(i%2==0) {
				arr[i]=num%2;
				num=num/2;
			}
			else {
				arr[i]=num%2;
				num=num/2;
			}
		}
		System.out.print("奇数位是： ");
		for(int i=0;i<32;i+=2) {
			System.out.printf("%d ",arr[i]);
		}
		System.out.print("偶数位是： ");
		for(int i=1;i<32;i+=2) {
			System.out.printf("%d ",arr[i]);
		}
	}*/

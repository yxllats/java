public class TestDemo {
	public static void main(String[] args) {
		int num=1;
		int temp=0;
		int sum=0;
		while(num<=100) {
			int i=2;
			for(;i<=(int)Math.sqrt(num);i++) {
				if(num%i==0) {
					break;
				}
			}
			if(i>(int)Math.sqrt(num)) {
				System.out.println(num);
				sum++;
			}
			num++;
		}
		System.out.println("共有"+sum+"个素数");
	}
}

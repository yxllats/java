public class TestDemo {
	public static void main(String[] args) {
		int sum=0;
		for(int num=1;num<=100;num++) {
			if(num%10==9) {
				System.out.println(num);
				sum++;
			}
			if(num/10==9) {
				System.out.println(num);
				sum++;
			}
		}
		System.out.println(sum);
	}
}
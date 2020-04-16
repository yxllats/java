public class TestDemo {
	public static void main(String[] args) {
	for(int num=0;num<=999999;num++) {
		int temp=1;
		int sum=0;
		int n=num;
		while(n/10!=0) {
			n=n/10;
			temp++;
		}
		n=num;
		while(n!=0) {
			sum+=Math.pow(n%10,temp);
			n=n/10;
		}
		if(num==sum) {
			System.out.println(num);
		}
	}
	}
}
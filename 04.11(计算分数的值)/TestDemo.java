public class TestDemo {
	public static void main(String[] args) {
		int temp=1;
		double sum=0;
		for(int i=1;i<=100;i++) {
			sum+=1.0/i*temp;
			temp*=-1;
		}
		System.out.println(sum);
	}
}
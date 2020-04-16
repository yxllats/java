public class TestDemo {
	public static void main(String[] args) {
		int sum=0;
		for(int year=1000;year<=2000;year++) {
			if(year%4==0&&year%100!=0) {
				System.out.println(year);
				sum++;
				year+=3;
			}
			else if(year%400==0) {
				System.out.println(year);
				sum++;
				year+=3; 
			}
		}
		System.out.println(sum);
	}
}
			
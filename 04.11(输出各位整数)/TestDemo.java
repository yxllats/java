public class TestDemo {
	public static void show(int n) {
		if(n>9) {
			show(n/10);
			System.out.print((n%10)+" ");
		}else {
			System.out.print(n+" ");
		}
	}
	
	public static void main(String[] args) {
		int num=123;
		show(num);		
	}
}
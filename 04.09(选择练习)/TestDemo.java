import java.util.*;
public class TestDemo {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		while(scan.hasNext()) {
			int old =scan.nextInt();
		if(old<=18) {
			System.out.println("少年");
		}
		else if(old>18&&old<=28) {
			System.out.println("青年");
		}
		else if(old>28&&old<=55) {
			System.out.println("中年");
		}
		else {
			System.out.println("老年");
		}
		}
	}
}
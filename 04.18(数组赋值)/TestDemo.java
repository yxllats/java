public class TestDemo {
	public static void set_Num(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			arr[i]=i+1;
		}
		}
	public static void printArray(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
	}
	public static void main(String[] args) {
		int[] array=new int[100];
		set_Num(array);
		printArray(array);
	}
}
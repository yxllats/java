public class TestDemo {
	public static void printArray(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		}
	public static void main(String[] args) {
		int[] array=new int[]{1,2,3};
		printArray(array);
	}
}
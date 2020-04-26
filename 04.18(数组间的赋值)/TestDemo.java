public class TestDemo {
	public static int[] transform(int[] arr) {
		int[] arr2=new int[arr.length];
		for(int i=0;i<arr.length;i++) {
			arr2[i]=arr[i]*2;
		}
		return arr2;
	}
	public static void main(String[] args) {
		int[] array=new int[]{1,2,3};
		int[] array2=new int[array.length];
		array2=transform(array);
		for(int i=0;i<array.length;i++) {
			System.out.print(array2[i]+" ");
		}
	}
}
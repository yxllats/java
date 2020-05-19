public class TestDemo {
	public static int num_Sum(int[] arr) {
		int sum=0;
		for(int i=0;i<arr.length;i++) {
			sum+=arr[i];
		}
		return sum;
	}
	public static void main(String[] args) {
		int[] array=new int[]{1,2,3,4,5,6};
		int sum=num_Sum(array);
		System.out.println(sum);
	}
}
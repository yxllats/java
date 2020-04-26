public class TestDemo {
	public static double num_Avg(int[] arr) {
		int sum=0;
		for(int i=0;i<arr.length;i++) {
			sum+=arr[i];
		}
		return (double)sum/arr.length;
	}
	public static void main(String[] args) {
		int[] array=new int[]{1,2,3,4,5,6};
		double avg=num_Avg(array);
		System.out.println(avg);
	}
}
public class TestDemo {
	public static void swapNum(int[] arr) {
		for(int i=1;i<=(arr.length/2);i++) {
			for(int j=i;j<arr.length-2;j++) {
				int temp=arr[j];
				arr[j]=arr[j+1];
				arr[j+1]=temp;
			}
		}
	}
	
	public static void main(String[] args) {
		int[] arr={1,2,1,2,1,2};
		swapNum(arr);
		for(int var:arr) {
			System.out.print(var+" ");
		}
	}
}
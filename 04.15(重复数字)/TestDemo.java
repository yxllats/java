public class TestDemo {
	public static void repeat(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			int j=0;
			for(;j<arr.length;j++) {
				if(i==j) {
					continue ;
				}
				if(arr[i]==arr[j]) {
					break;
				}
			}
			if(j==arr.length) {
					System.out.println(arr[i]);
				}
		}
	}
	
	public static void main(String[] args) {
		int[] array=new int[]{1,2,2,1,3};
		repeat(array);
	}
}
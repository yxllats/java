public class Solution {
    public String PrintMinNumber(int [] numbers) {
        String string = new String();
        if(numbers.length==0||numbers==null){
            return string;
        }

        for(int i=0;i<numbers.length;i++){
            for(int j=i+1;j<numbers.length;j++){
                int n = Integer.parseInt(""+numbers[i]+numbers[j]);
                int m = Integer.parseInt(""+numbers[j]+numbers[i]);
                if(m<n){
                    int temp = numbers[j];
                    numbers[j] = numbers[i];
                    numbers[i] = temp;
                }
            }
            string+=numbers[i];
        }
        return string;
    }
}
public class Main {
    public static void main(String[] args) {
        System.out.println(isPrettyNumber(9));
    }


        public static int isPrettyNumber(int number)  {
            // 请在此添加代码
            int n = number;
            for(int i = 2;i<=Math.sqrt((double)number);i++){
                if(number%i==0){
                    n-=i;
                    if(i<Math.sqrt(number)){
                        n= n - (number/i);
                    }
                }
            }
            if(n!=1){
                return 0;
            }
            return 1;
        }



}

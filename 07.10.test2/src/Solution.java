public class Solution {
    public static int calculateMax(int[] prices) {
        int dpi10 = 0,dpi11=Integer.MIN_VALUE;
        int dpi20 = 0,dpi21=Integer.MIN_VALUE;
        for(int price:prices){
            dpi20 = Math.max(dpi20,dpi21+price);
            dpi21 = Math.max(dpi21,dpi10-price);
            dpi10 = Math.max(dpi10,dpi11+price);
            dpi11 = Math.max(dpi11,-price);
        }
        return dpi20;
    }

    public static void main(String[] args) {
        int[] array = {3,8,5,1,7,8};
        System.out.println(calculateMax(array));
    }
}

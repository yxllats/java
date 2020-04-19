/**
 * Author: dts
 * DateTime: 2020/4/19 13:58
 * Description: 交换数据
 */
class SwapNum {
    private int[] arr1=new int[2];
    private double[] arr2=new double[2];
    public SwapNum() {
    }
    public SwapNum(int x,int y) {
        this.arr1[0]=x;
        this.arr1[1]=y;
    }
    public SwapNum(double x,double y) {
        this.arr2[0]=x;
        this.arr2[1]=y;
    }
    public void swapIntNum() {
        int temp=this.arr1[0];
        this.arr1[0]=this.arr1[1];
        this.arr1[1]=temp;
    }
    public void swapDouNum() {
        double temp=this.arr2[0];
        this.arr2[0]=this.arr2[1];
        this.arr2[1]=temp;
    }
    public void showIntNum() {
        System.out.println("x="+arr1[0]+","+"y="+arr1[1]);
    }
    public void showDouNum() {
        System.out.println("x="+arr2[0]+","+"y="+arr2[1]);
    }
}
public class TestsDemo {
    public static void main(String[] args) {
        SwapNum swapnum=new SwapNum(2,4);
        swapnum.swapIntNum();
        swapnum.showIntNum();
    }

}

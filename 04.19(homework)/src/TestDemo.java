/**
 * Author: dts
 * DateTime: 2020/4/19 13:43
 * Description: 实现Calculator类
 */
class Calculator {
    private int num1;
    private int num2;
    public void setNum(int x,int y){
        this.num1=x;
        this.num2=y;
    }
    public int addNum() {
        return (this.num1+this.num2);
    }
    public int subNum() {
        return (this.num1-this.num2);
    }
    public int mulNum() {
        return (this.num1*this.num2);
    }
    public double divNum() {
        return ((double)this.num1 / (double)this.num2);
    }

}
public class TestDemo {
    public static void main(String[] args) {
        Calculator cal = new Calculator();
        cal.setNum(2,6);
        int addnum=cal.addNum();
        System.out.println(addnum);
        int subnum=cal.subNum();
        System.out.println(subnum);
        int mulnum=cal.mulNum();
        System.out.println(mulnum);
        double divnum=cal.divNum();
        System.out.println(divnum);
    }
}


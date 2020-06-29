/**
 * Author: dts
 * DateTime: 2020/6/19 11:06
 * Description: TODO
 */
public class Parse {
    // 输入的字符串
    private String exp;
    // 当前扫描到的字符串下标
    private int index = 0;

    public Parse(String exp) {
        this.exp = exp;
    }

    public void match(char token) {
        if (index == (exp.length() - 1)) {
            System.out.println("合法！");
            // System.exit(0); 这里退出程序的话，就不能进行多组数据验证
        } else if (exp.charAt(index) == token) {
            index++;
        } else {
            error();
        }
    }

    public void error() {
        System.out.println("Syntax error!");
        System.exit(0);
    }

    //  E->TE'
    public void E() {
        System.out.println("E->TE'");
        T();
        E1();
    }

    // E'->+TE'|ε
    public void E1() {
        if (exp.charAt(index) == '+') {
            match('+');
            System.out.println("E'->+TE'");
            T();
            E1();
        } else {
            System.out.println("E'->ε");
        }
    }

    // T->FT'
    private void T() {
        System.out.println("T->FT'");
        F();
        T1();
    }

    //  T'->*FT'|ε
    private void T1() {
        if (exp.charAt(index) == '*') {
            match('*');
            System.out.println("T'->*FT'");
            F();
            T1();
        } else {
            System.out.println("T'->ε");
        }
    }

    // F->(E)|i
    private void F() {
        if (exp.charAt(index) == '(') {
            match('(');
            E();
            if (exp.charAt(index) == ')') {
                match(')');
                System.out.println("F->(E)");
            } else {
                error();
            }
        } else if (exp.charAt(index) == 'i') {
            match('i');
            System.out.println("F->i");
        } else {
            error();
        }
    }

    public static void main(String[] args) {
        // 测试数据第一行为合法数据，第二行为非法数据
        String [] tests = {
                "i*i*i", "i+i+i", "i+i*i", "i*i+i",
                "i**i", "i++i"};
        for (int i = 0; i < tests.length; i++) {
            Parse parse = new Parse(tests[i]);
            parse.E();
        }
    }

}
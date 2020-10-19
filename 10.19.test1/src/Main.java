class A{
    public void run(){
        System.out.println("1");
    }
}

class B extends A{
    public void run(){
        System.out.println("2");
    }
}
public class Main {
    public static void main(String[] args) {
        B b = new B();
        b.run();
        A a = b;
        a.run();
        System.out.println(a.getClass() == A.class);
        System.out.println(a.getClass() == B.class);
    }
    /*public static void main(String[] args) {
        int x=4;
        System.out.println("val="+(x>4?4.4:9));
    }*/
}

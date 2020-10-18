/*public class Batman {
    int re = 81;

    public static void main(String[] args) {
        new Batman().go();
    }

    private void go() {
        incr(++re);
        System.out.println(re);
    }

    private void incr(int i) {
        re+=10;
    }
}*/

/*class X{
    public X aMethod(){
        return this;
    }

}
class Y extends X{
    public X aMethod(){
        return new Y();
    }
}*/

public class X{
    long len;
    public X(long l){
        len = l;
    }

    public static void main(String[] args) {
        X s1,s2,s3;
        s1 = new X(21L);
        s2 = new X(21L);
        System.out.println(s1.equals(s2));
    }
}

import java.util.Map;
import java.util.TreeMap;

class Student{
    String name;
    int id;

    public Student(String name, int id) {
        this.name = name;
        this.id = id;
    }
    public void Student(){

    }
}
interface jiekou{
}
public class Main {
    public static void main(String[] args) {
        long l = 444;
        String s[];
        String aa ;
        String ss3 = "abc";
        String ss4 = "abc";
        String ss1 = new String("abc");
        String ss2 = new String("abc");
        /*System.out.println(ss1.equals(ss2));
        System.out.println(ss1 == ss2);
        System.out.println(ss3 == ss2);
        System.out.println(ss3 == ss4);*/
        Integer a1 = 17;
        Integer a2 = 17;
        Integer a6 = 1717;
        /*Integer a3 = new Integer(17);
        Integer a4 = new Integer(17);
        Integer a5 = new Integer(1717);
        System.out.println(a1 == a2);
        System.out.println(a1 == a3);
        System.out.println(a3 == a4);
        System.out.println(a5 == a6);*/
        Student student1 = new Student("aa",1);
        Student student2 = new Student("aa",1);
        System.out.println(student1 == student2);
        Map<Integer,Integer> map = new TreeMap<>();

    }
}

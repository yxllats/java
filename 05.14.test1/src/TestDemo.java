import java.util.ArrayList;
import java.util.List;

/**
 * Author: dts
 * DateTime: 2020/5/14 16:05
 * Description: TODO
 */
class Student{
    String name;
    String grad;
    double num;

    public Student(String name, String grad, double num) {
        this.name = name;
        this.grad = grad;
        this.num = num;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", grad='" + grad + '\'' +
                ", num=" + num +
                '}';
    }
}
public class TestDemo {
    public static void main(String[] args) {
        List<Student> list = new ArrayList<>();
        list.add(new Student("a","b",12));
        System.out.println(list);
    }
}

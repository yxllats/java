import java.util.Arrays;

class Student implements  Comparable {
    private String name;
    private int score;
    public Student(String name, int score) {
        this.name = name;
        this.score = score;
    }

    @Override
    public String toString() {
        return "[" + this.name + ":" + this.score + "]";
    }
    @Override
    public int compareTo(Object o) {
        Student s = (Student)o;
        if (this.score > s.score) {
            return -1;
        } else if (this.score < s.score) {
            return 1;
        } else {
            return 0;
        }
    }
}

public class Solution {
    public static void main(String[] args) {
        Student[] students = new Student[] {
                new Student("张三", 98),
                new Student("李四", 96),
                new Student("王五", 97),
                new Student("赵六", 92),
        };
        Arrays.sort(students);
        System.out.println(Arrays.toString(students));
    }
}

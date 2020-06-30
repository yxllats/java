import java.util.*;

class Student {
    public String name;
    public int score;
    public Student(String name,int score)
    {
        this.name=name;
        this.score=score;
    }

}
public class Main{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);


        while (in.hasNext()) {
            List<Student> list = new ArrayList<Student>();
            int num = in.nextInt();
            int n = in.nextInt();
            if(n==1) {
                for (int i = 0; i < num; i++) {
                    list.add(new Student(in.next(),in.nextInt()));
                }
                list.sort(new Comparator<Student>() {
                    @Override
                    public int compare(Student o1, Student o2) {
                        return o1.score - o2.score;
                    }
                });
            }else{
                for (int i = 0; i < num; i++) {
                    list.add(new Student(in.next(),in.nextInt()));
                }
                list.sort(new Comparator<Student>() {
                    @Override
                    public int compare(Student o1, Student o2) {
                        return o2.score - o1.score;
                    }
                });
            }
            for(int i=0;i<list.size();i++)
            {
                System.out.println(list.get(i).name+" "+list.get(i).score);
            }
        }
    }
}
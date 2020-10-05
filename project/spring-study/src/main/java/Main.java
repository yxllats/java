import dts.Duck3;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applications.xml");
        String bit = (String)context.getBean("bit");
//        System.out.println(bit);
        Duck3 duck = (Duck3)context.getBean("d3");
        System.out.println(duck);
    }
}
import book.BookList;
import user.Admin;
import user.NormalUser;
import user.User;

import java.util.Scanner;

/**
 * Author: dts
 * DateTime: 2020/5/4 22:44
 * Description: TODO 图书馆里系统
 */
public class TestMain {
    public static User login() {
        Scanner scan = new Scanner(System.in);
            System.out.println("请输入你的姓名");
            String name = scan.nextLine();
            System.out.println("请选择你的身份1：管理员  2：用户");
            int n = scan.nextInt();
            if(n == 1) {
                return new Admin(name);
            }else {
                return new NormalUser(name);
        }
    }
    public static void main(String[] args) {
        BookList booklist = new BookList();
        User user = login();
        while(true) {
            int choice = user.menu();
            user.doOperation(choice, booklist);
        }
    }
}

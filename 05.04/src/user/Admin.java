package user;

import book.BookList;
import operation.*;

import java.util.Scanner;

/**
 * Author: dts
 * DateTime: 2020/5/5 0:37
 * Description: TODO
 */
public class Admin extends User {
    public Admin(String name) {
        super(name);
        this.operations = new IOperation[]{
                new ExitOperation(),
                new FindOperation(),
                new AddOperation(),
                new DelOperation(),
                new DisplayOperation()
        };
    }

    @Override
    public int menu() {
        Scanner scan = new Scanner(System.in);
        System.out.println("---------------");
        System.out.println(this.name+"欢迎来到图书管理系统");
        System.out.println("请选择：");
        System.out.println("1.查找书籍");
        System.out.println("2.增加书籍");
        System.out.println("3.删除书籍");
        System.out.println("4.打印书籍列表");
        System.out.println("0.退出系统");
        int choice = scan.nextInt();
        return choice;
    }

    @Override
    public void doOperation(int choice, BookList booklist) {
        this.operations[choice].work(booklist);
    }
}

package user;

import book.BookList;
import operation.*;

import java.util.Scanner;

/**
 * Author: dts
 * DateTime: 2020/5/5 0:37
 * Description: TODO
 */
public class NormalUser extends User {
    public NormalUser(String name) {
        super(name);
        this.operations = new IOperation[]{
                new ExitOperation(),
                new FindOperation(),
                new BorrowOperation(),
                new ReturnOperation()
        };
    }

    @Override
    public int menu() {
        Scanner scan = new Scanner(System.in);
        System.out.println("---------------");
        System.out.println(this.name+"欢迎来到图书管理系统");
        System.out.println("请选择：");
        System.out.println("1.查找书籍");
        System.out.println("2.借阅书籍");
        System.out.println("3.归还书籍");
        System.out.println("0.退出系统");
        int choice = scan.nextInt();
        return choice;
    }

    @Override
    public void doOperation(int choice, BookList booklist) {
        this.operations[choice].work(booklist);
    }
}

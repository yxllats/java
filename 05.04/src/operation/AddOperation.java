package operation;

import book.Book;
import book.BookList;
import com.sun.javaws.IconUtil;

import java.util.Scanner;

/**
 * Author: dts
 * DateTime: 2020/5/4 22:52
 * Description: TODO
 */
public class AddOperation implements IOperation {
    @Override
    public void work(BookList bookList) {
        System.out.println("添加图书");
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入图书的名字：");
        String name = scanner.nextLine();
        System.out.println("请输入图书的作者：");
        String author = scanner.nextLine();
        System.out.println("请输入图书的价格：");
        int price = scanner.nextInt();
        System.out.println("请输入图书的类型：");
        String type = scanner.next();

        Book book = new Book(name,author,price,type);
        int pos = bookList.getUsedSize();
        bookList.add(pos,book);
        bookList.setUsedSize(pos+1);
        System.out.println("添加成功");
    }
}

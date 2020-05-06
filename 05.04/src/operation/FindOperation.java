package operation;

import book.Book;
import book.BookList;

import java.util.Scanner;

/**
 * Author: dts
 * DateTime: 2020/5/4 22:54
 * Description: TODO
 */
public class FindOperation implements IOperation {
    @Override
    public void work(BookList bookList) {
        System.out.println("查找图书");
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入图书的名字：");
        String name = scanner.nextLine();
        for (int i = 0; i < bookList.getUsedSize(); i++) {
            Book book = bookList.getBook(i);
            if(name.equals(book.getName())) {
                System.out.println("已找到");
                System.out.println(book);
                return;
            }
        }

        System.out.println("未找到");
    }
}

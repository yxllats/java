package operation;

import book.Book;
import book.BookList;

import java.util.Scanner;

/**
 * Author: dts
 * DateTime: 2020/5/4 22:52
 * Description: TODO
 */
public class BorrowOperation implements IOperation {
    @Override
    public void work(BookList bookList) {
        System.out.println("借阅图书");
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入图书的名字：");
        String name = scanner.nextLine();
        for (int i = 0; i < bookList.getUsedSize(); i++) {
            Book book = bookList.getBook(i);
            if(name.equals(book.getName())) {
                book.setBorrowed(true);
                System.out.println("借阅成功");
                return;
            }
        }
        System.out.println("未找到该书");
    }
}

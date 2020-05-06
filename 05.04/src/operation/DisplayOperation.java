package operation;

import book.Book;
import book.BookList;

/**
 * Author: dts
 * DateTime: 2020/5/4 22:53
 * Description: TODO
 */
public class DisplayOperation implements IOperation {
    @Override
    public void work(BookList bookList) {
        System.out.println("展示图书");
        for (int i = 0; i < bookList.getUsedSize(); i++) {
            Book book = bookList.getBook(i);
            System.out.println(book);
        }
    }
}

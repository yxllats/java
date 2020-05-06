package operation;

import book.Book;
import book.BookList;

import java.util.Scanner;

/**
 * Author: dts
 * DateTime: 2020/5/4 22:53
 * Description: TODO
 */
public class DelOperation implements IOperation {
    @Override
    public void work(BookList bookList) {
        System.out.println("删除图书");
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入图书的名字：");
        String name = scanner.nextLine();
        int i =0;
        for (i = 0; i < bookList.getUsedSize(); i++) {
            Book book = bookList.getBook(i);
            if(name.equals(book.getName())) {
                break;
            }
        }
        if(i == bookList.getUsedSize()){
            System.out.println("未找到该书");
            return;
        }else {
            for(int pos = i;pos<bookList.getUsedSize()-1;pos++){
                Book book = bookList.getBook(pos+1);
                bookList.add(pos,book);
            }
        }
        bookList.setUsedSize(bookList.getUsedSize()-1);
        System.out.println("删除成功");
    }
}

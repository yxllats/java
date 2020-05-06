package operation;

import book.BookList;

/**
 * Author: dts
 * DateTime: 2020/5/4 22:54
 * Description: TODO
 */
public class ExitOperation implements IOperation {
    @Override
    public void work(BookList bookList) {
        System.out.println("退出系统");
        System.exit(1);
    }
}

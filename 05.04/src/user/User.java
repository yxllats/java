package user;

import book.BookList;
import operation.IOperation;

/**
 * Author: dts
 * DateTime: 2020/5/5 0:37
 * Description: TODO
 */
public abstract class User {
    protected String name;
    protected IOperation[] operations;

    public User(String name) {
        this.name = name;
    }

    public abstract int menu();
    public void doOperation(int choice, BookList booklist){
        this.operations[choice].work(booklist);
    }
}

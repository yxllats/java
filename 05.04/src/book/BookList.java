package book;

/**
 * Author: dts
 * DateTime: 2020/5/4 22:52
 * Description: TODO
 */
public class BookList {
    private Book[] books = new Book[100];
    private int usedSize = 0;

    public BookList() {
        this.books[0] = new Book("三国演义","罗贯中",100,"小说");
        this.books[1] = new Book("西游记","吴承恩",100,"小说");
        this.usedSize = 2;
    }

    public void add(int pos,Book book) {
        this.books[pos] = book;
    }
    public Book getBook(int pos){
        return this.books[pos];
    }

    public int getUsedSize() {
        return this.usedSize;
    }

    public void setUsedSize(int usedSize) {
        this.usedSize = usedSize;
    }
}

import com.xiaoxu.entity.Book;
import com.xiaoxu.service.BookService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

/**
 * @author Administrator
 * @create 2020 -07 -15 9:29
 */
public class BookTest {
    @Test
    public void addTest() {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
        BookService bookService = context.getBean("bookService", BookService.class);
        Book book = new Book();

        book.setBookName("中华上下五千年");
        book.setBookStatus("ok");
        bookService.addBook(book);
    }

    @Test
    public void updateTest() {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
        BookService bookService = context.getBean("bookService", BookService.class);
        Book book = new Book();
        book.setBookId("1");
        book.setBookName("中华上下五千年No1");
        book.setBookStatus("no");
        bookService.updateBook(book);
    }

    @Test
    public void deleteTest() {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
        BookService bookService = context.getBean("bookService", BookService.class);
        Book book = new Book();
        book.setBookId("2");
        bookService.deleteBook(book);
    }

    @Test
    public void selectCountTest() {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
        BookService bookService = context.getBean("bookService", BookService.class);
        bookService.selectCount();
    }
    @Test
    public void selectBookTest() {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
        BookService bookService = context.getBean("bookService", BookService.class);
        Book book = bookService.selectBook("1");
        System.out.println(book);
    }
    @Test
    public void selectBookListTest() {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
        BookService bookService = context.getBean("bookService", BookService.class);
        List<Book> books = bookService.selectBookList();
        System.out.println(books);
    }

}

package com.xiaoxu.service;

import com.xiaoxu.dao.BookDao;
import com.xiaoxu.entity.Book;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author Administrator
 * @create 2020 -07 -15 9:11
 */
@Service
public class BookService {
    /**
     * 注入DAO
     */
    @Resource
    private BookDao bookDao;

    public void addBook(Book book) {
        bookDao.addBook(book);
    }

    public void updateBook(Book book) {
        bookDao.updateBook(book);
    }

    public void deleteBook(Book book) {
        bookDao.deleteBook(book);
    }

    public Integer selectCount() {
        return bookDao.selectCount();
    }

    public Book selectBook(String id) {
        return bookDao.selectBook(id);
    }

    public List<Book> selectBookList(){
        return bookDao.selectBookList();
    }
}

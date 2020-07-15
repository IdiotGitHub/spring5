package com.xiaoxu.dao;

import com.xiaoxu.entity.Book;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author Administrator
 * @create 2020 -07 -15 9:13
 */
@Repository
public class BookDaoImpl implements BookDao {
    @Resource
    private JdbcTemplate jdbcTemplate;

    public void addBook(Book book) {
        String insertSql = "insert into book values(?,?,?);";
        int row = jdbcTemplate.update(insertSql, null, book.getBookName(), book.getBookStatus());
        System.out.println(row);
    }

    public void updateBook(Book book) {
        String updateSql = "update book set book_name = ?, book_status = ? where id = ?;";
        int row = jdbcTemplate.update(updateSql,  book.getBookName(), book.getBookStatus(), book.getBookId());
        System.out.println(row);
    }

    public void deleteBook(Book book) {
        String deleteSql = "delete from book where id = ?;";
        int row = jdbcTemplate.update(deleteSql, book.getBookId());
        System.out.println(row);
    }

    public Integer selectCount() {
        String selectSql = "select count(id) from book";
        Integer count = jdbcTemplate.queryForObject(selectSql, Integer.class);
        System.out.println(count);
        return count;

    }

    public Book selectBook(String id) {
        String selectSql = "select * from book where id = ?";
        return jdbcTemplate.queryForObject(selectSql, new BeanPropertyRowMapper<Book>(Book.class), id);
    }

    public List<Book> selectBookList() {
        String selectSql = "select * from book ";

        return jdbcTemplate.query(selectSql, new BeanPropertyRowMapper<Book>(Book.class));
    }

    public void insertBookList(List<Object[]> list) {
        String insertSql = "insert into book values(?,?,?)";
        int[] ints = jdbcTemplate.batchUpdate(insertSql, list);
        System.out.println(ints);
    }
}

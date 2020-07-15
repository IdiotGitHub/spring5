package com.xiaoxu.dao;

import com.xiaoxu.entity.Book;

import java.util.List;

/**
 * @author Administrator
 * @create 2020 -07 -15 9:12
 */
public interface BookDao {
    /**
     * 添加一个条数据
     *
     * @param book book对象
     */
    void addBook(Book book);

    /**
     * 修改一个条数据
     *
     * @param book book对象
     */
    void updateBook(Book book);


    /**
     * 删除一个条数据
     *
     * @param book book对象
     */
    void deleteBook(Book book);

    /**
     * 查询表中数据数量
     *
     * @return 数据量
     */
    Integer selectCount();


    /**
     * 查询表中数据数量
     *
     * @param id id号
     * @return 数据量
     */
    Book selectBook(String id);

    /**
     * 查询表中数据数量
     *
     * @return 数据量
     */
    List<Book> selectBookList();

    /**
     * 批量插入数据
     * @param list 数据集合
     */
    void insertBookList(List<Object[]> list);



}

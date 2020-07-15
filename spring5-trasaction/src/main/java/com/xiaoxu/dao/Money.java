package com.xiaoxu.dao;

import java.math.BigDecimal;

/**
 * @author Administrator
 * @create 2020 -07 -15 14:29
 */
public interface Money {
    /**
     * 减钱
     *
     * @param username 用户名
     * @param money 钱
     */
    void subMoney(String username, BigDecimal money);
    /**
     * 加钱
     *
     * @param username 用户名
     * @param money 钱
     */
    void addMoney(String username, BigDecimal money);
}

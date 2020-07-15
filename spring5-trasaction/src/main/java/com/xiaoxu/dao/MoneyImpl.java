package com.xiaoxu.dao;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.math.BigDecimal;

/**
 * @author Administrator
 * @create 2020 -07 -15 14:33
 */
@Repository
public class MoneyImpl implements Money {
    @Resource
    private JdbcTemplate jdbcTemplate;
    public void subMoney(String username, BigDecimal money) {
        String updateSql = "update money set money = money - ? where username = ?";
        jdbcTemplate.update(updateSql, money, username);
    }

    public void addMoney(String username, BigDecimal money) {
        String updateSql = "update money set money = money + ? where username = ?";
        jdbcTemplate.update(updateSql, money, username);
    }
}

package com.xiaoxu.entity;

import java.math.BigDecimal;

/**
 * @author Administrator
 * @create 2020 -07 -15 14:35
 */
public class MoneyEntity {
    private Integer id;
    private String username;
    private BigDecimal money;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public BigDecimal getMoney() {
        return money;
    }

    public void setMoney(BigDecimal money) {
        this.money = money;
    }

    @Override
    public String toString() {
        return "MoneyEntity{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", money=" + money +
                '}';
    }
}

package com.xiaoxu.service;

import com.xiaoxu.dao.Money;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.math.BigDecimal;

/**
 * @author Administrator
 * @create 2020 -07 -15 14:34
 */
@Service
@Transactional(propagation = Propagation.REQUIRED,isolation = Isolation.REPEATABLE_READ,rollbackFor = {Exception.class})
public class MoneyService {
    @Resource
    private Money money;
    public void transferAccount(String reUserName, String outUserName, BigDecimal cash) {
        money.subMoney(outUserName,cash);
        int i = 10/0;
        money.addMoney(reUserName, cash);
    }
}

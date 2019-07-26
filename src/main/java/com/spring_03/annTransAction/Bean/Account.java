package com.spring_03.annTransAction.Bean;

import org.springframework.stereotype.Component;

import java.math.BigDecimal;

/**
 * @Author: hwg
 * @Date: Create in 2019/7/3
 */
@Component
public class Account {
    private long id;
    private BigDecimal balance;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }
}

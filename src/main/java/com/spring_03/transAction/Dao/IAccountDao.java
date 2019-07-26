package com.spring_03.transAction.Dao;


import java.math.BigDecimal;

/**
 * @Author: hwg
 * @Date: Create in 2019/7/3
 */
public interface IAccountDao {
    /**
     * 存钱
     * @param id
     * @param act
     */
    void transIn(long id, BigDecimal act);

    /**
     * 取钱
     * @param id
     * @param act
     */
    void transOut(long id,BigDecimal act);
}

package com.spring_03.annTransAction.Service;

import java.math.BigDecimal;

/**
 * @Author: hwg
 * @Date: Create in 2019/7/3
 */
public interface AccountService {

    void transfer(long outId, long inId, BigDecimal balance);

    void transIn(long id, BigDecimal act);
    void transOut(long id, BigDecimal act);
}

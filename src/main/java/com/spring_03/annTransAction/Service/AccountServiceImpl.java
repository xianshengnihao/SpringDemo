package com.spring_03.annTransAction.Service;

import com.spring_03.annTransAction.Dao.IAccountDao;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.math.BigDecimal;

/**
 * @Author: hwg
 * @Date: Create in 2019/7/3
 */
@Component("accountServiceImpl")
@Transactional
public class AccountServiceImpl implements AccountService {
    @Resource
    private IAccountDao accountDao;
    /**
     * 转账
     * @param outId
     * @param inId
     * @param balance
     */
    @Override
    public void transfer(long outId, long inId, BigDecimal balance) {
        this.transOut(outId,balance);
//        try {
//            int i=1/0;
//        }catch (Exception e){
//            throw e;
//        }

        this.transIn(inId,balance);

    }

    /**
     * 存钱
     * @param id
     * @param act
     */
    @Override
    @Transactional(propagation = Propagation.REQUIRED,readOnly = true)
    public void transIn(long id, BigDecimal act) {
        accountDao.transIn(id,act);
    }

    /**
     * 取钱
     * @param id
     * @param act
     */
    @Override
    @Transactional(propagation = Propagation.REQUIRED,readOnly = true)
    public void transOut(long id, BigDecimal act) {
        accountDao.transOut(id,act);
    }
}

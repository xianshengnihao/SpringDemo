package com.spring_03.annTransAction.Dao;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.math.BigDecimal;

/**
 * @Author: hwg
 * @Date: Create in 2019/7/3
 */
@Component
public class IAccountDaoImpl implements IAccountDao {
//    private JdbcTemplate template;
//    public void setDataSource(DataSource dataSource){
//        this.template= new JdbcTemplate(dataSource);
//    }
    @Resource
    private JdbcTemplate template;
    @Override
    public void transIn(long id, BigDecimal act) {
        String sql="UPDATE account SET balance = balance + ? WHERE id = ?";
        template.update(sql,act,id);
    }

    @Override
    public void transOut(long id, BigDecimal act) {
        String sql="UPDATE account SET balance = balance - ? WHERE id = ?";
        template.update(sql,act,id);
    }
}

package com.spring_02._06AnnAop.dao;

import org.springframework.stereotype.Component;

/**
 * @Author: hwg
 * @Date: Create in 2019/6/21
 */
@Component
public class TargetImpl implements ITarget {


    @Override
    public void somethin() {
        System.out.println("业务逻辑。。");
    }
}

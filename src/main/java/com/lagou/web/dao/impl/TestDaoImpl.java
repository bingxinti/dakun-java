package com.lagou.web.dao.impl;

import com.lagou.web.dao.TestDao;
import com.lagou.web.model.TestModel;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by Demon on 16/12/22.
 */
public class TestDaoImpl  extends BaseDaoImpl implements TestDao{

    @Resource
    private TestDao testDao;

    public List<TestModel> selectAllTest()
    {
        List<TestModel> testList =  testDao.selectAllTest();
        return  testList;
    }

}



package com.lagou.web.dao.impl;

import com.lagou.web.dao.TestDao;
import com.lagou.web.model.TestModel;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Demon on 16/12/25.
 */
public class TestDaoImpl  extends BaseDaoImpl implements TestDao {

    @Resource
    private TestDao testDao;

    public List<Map<String,Object>> query(Map map)
    {
        return testDao.query(map);
    }


    public List<TestModel> selectAllTest()
    {
        return testDao.selectAllTest();
    }


    public void select()
    {

        //查询
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("sql", " SELECT * FROM test LIMIT 3 ; ");
        List<Map<String,Object>> queryList = testDao.query(map);



    }

    public String testdb()
    {
        return "dqwdqwd";
    }


}

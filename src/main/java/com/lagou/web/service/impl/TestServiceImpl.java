package com.lagou.web.service.impl;

import com.lagou.web.dao.TestDao;
import com.lagou.web.model.TestModel;
import com.lagou.web.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by Demon on 16/12/19.
 */
@Service
@Transactional(rollbackFor = Exception.class)
public class TestServiceImpl  extends BaseServiceImpl  implements TestService{

    @Autowired
    @Qualifier("testDao")
    private TestDao testDao;

    public List<TestModel> getAllTest(){
        return testDao.selectAllTest();
    }

}

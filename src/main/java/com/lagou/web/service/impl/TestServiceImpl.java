package com.lagou.web.service.impl;

import com.lagou.web.dao.TestDao;
import com.lagou.web.dao.impl.TestDaoImpl;
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

@Transactional
@Service
public class TestServiceImpl  extends BaseServiceImpl  implements TestService{

//    @Autowired
//    @Qualifier("testDao")
//    private TestDao testDao;

    @Resource
    private TestDao testDao;

    public List<TestModel> getAllTest(){
        return testDao.selectAllTest();
    }

}

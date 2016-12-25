package com.lagou.web.service.impl;

import com.lagou.web.dao.TestDao;
import com.lagou.web.dao.impl.TestDaoImpl;
import com.lagou.web.model.TestModel;
import com.lagou.web.service.TestService;
import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Demon on 16/12/19.
 */
@Service
@Transactional(rollbackFor = Exception.class)
public class TestServiceImpl  extends BaseServiceImpl  implements TestService{

    @Resource
    private TestDao testDao;

    public List<TestModel> getAllTest(){

//        查询
//        Map<String, Object> map = new HashMap<String, Object>();



//        map.put("sql", " INSERT INTO `test` (`title`) VALUES ('1')  ");
//        map.put("sql", " INSERT INTO `test` ( `sort`) VALUES ('8') ");
//        int  insert = testDao.insert(map);
//        Object lastInsertID = map.get("lastInsertID");



//        map.put("sql", " UPDATE `test` SET `title`='12312' WHERE `id`='52' ");
//        map.put("sql", " UPDATE `test` SET `title` = '擦擦擦擦擦擦' WHERE `id` = '50' ");
//        int  update = testDao.update(map);

//        map.put("sql", "  DELETE FROM `dbdakun`.`test` WHERE `id`='64'; ");
//        int  update = testDao.delete(map);

        return testDao.selectAllTest();
    }

}

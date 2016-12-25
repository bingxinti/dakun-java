package com.lagou.web.service.impl;

import com.lagou.web.dao.TestDao;
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
        Map<String, Object> map = new HashMap<String, Object>();

//
//        map.put("sql", " SELECT * FROM test  t left join user u on 1;  ");
//        map.put("sql", " SELECT * FROM test ; ");
////        map.put("sql", " INSERT INTO `dbdakun`.`test` (`title`, `sort`) VALUES ('1', '1'); ");
//        List<Map<String,Object>> queryList = testDao.select(map);


//        map.put("sql", " INSERT INTO `test` (`title`) VALUES ('1')  ");
//        map.put("sql", " INSERT INTO `test` ( `sort`) VALUES ('8') ");
////
//        int  insert = testDao.insert(map);


        map.put("sql", " UPDATE `test` SET `title`='12312' WHERE `id`='52' ");
        String  update = testDao.update(map);

//

        //查询，返回List<Map>
//        List<Map<String, Object>> list = sqlMapper.selectList("select * from country where id < 11");



        return testDao.selectAllTest();

    }
}

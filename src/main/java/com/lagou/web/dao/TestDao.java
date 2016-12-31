package com.lagou.web.dao;

import com.lagou.web.model.TestModel;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;



public interface TestDao {

    List<TestModel> selectAllTest();

//    List<Map<String,Object>>  query(Map map);
}

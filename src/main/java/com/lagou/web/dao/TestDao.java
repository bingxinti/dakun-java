package com.lagou.web.dao;

import com.lagou.web.model.TestModel;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


@Repository
public interface TestDao {
    List<TestModel> selectAllTest();

//    List<Object> query(Map map);
    List<Map<String,Object>>  select(Map map);

    int insert(Map map);

    int update(Map map);

//    editIssuedData(Map map);


}

package com.lagou.web.dao;

import com.lagou.web.model.TestModel;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface TestDao {
    List<TestModel> selectAllTest();
}

package com.lagou.web.service;

import com.lagou.web.model.TestModel;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by Demon on 16/12/19.
 */

public interface TestService {

    List<TestModel> getAllTest();

}

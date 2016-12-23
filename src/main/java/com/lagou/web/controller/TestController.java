package com.lagou.web.controller;

import com.lagou.web.model.TestModel;
import com.lagou.web.service.TestService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * Created by Demon on 16/12/19.
 */
@Controller
@RequestMapping("/test")
public class TestController extends BaseController{

    @Resource
    private TestService testService;

    @RequestMapping("/test01")
    public  String test01(HttpServletRequest request,Model model,String Params1)
    {
        testdb(model);
        return "test01";
    }

    @RequestMapping("/testdb")
    public  void testdb(Model model)
    {
        List<TestModel> testList = testService.getAllTest();
        model.addAttribute("testList",testList);

        String str1 = "str1str1str1";
    }

}

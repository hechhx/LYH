package com.qf.controller;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Ran
 * @since JDK 1.8
 *
 *  用户登录成功后访问的模块
 */
@RestController()
@RequestMapping("/page")
public class PageController {
    @RequestMapping(value = "/getPage",produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public List<String> getPage(){
        List<String> list = new ArrayList<>();
        list.add("数据1");
        list.add("数据2");
        list.add("数据3");
        list.add("数据4");
        return list;
    }
}

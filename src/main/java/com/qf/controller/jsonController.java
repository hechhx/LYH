package com.qf.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.qf.entity.User;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author lyh666
 * @Date 2019/9/26 10:12
 * 前端发送json格式的数据:
 *       1.需要导包
 *           jackson fastJson Gson
 *       2.$.ajax({
 *          contentType:application/json
 *       })
 *       3.参数必须使用@RequestBody
 *
 *       4.SpringMVC需要进行解析
 */
@RestController
@Slf4j

public class jsonController {
    @RequestMapping("/json")
    public String json(@RequestBody String json){
        /*List<User> list = JSON.parseArray(json, User.class);*/

        log.debug("json:"+json);
        return "1";
    }
}

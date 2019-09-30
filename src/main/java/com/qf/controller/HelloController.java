package com.qf.controller;

import com.qf.entity.User;
import com.qf.entity.User;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * @author Ran
 * @since JDK 1.8
 *
 *  lombok
 *  实体类添加注解@Data
 *
 *  logback 日记文件
 * @Slf4j
 *
* */
/*@Controller*/
@RestController
@RequestMapping("/HelloController")
@Slf4j
public class HelloController {

    /*
    *   使用对象接收表单数据
    *   对象属性必须跟表单的name值相等
    * */
    @RequestMapping(value = "/add",produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public String add(User user){
        /*log.info();*/
        /*log.error();*/
        log.debug(user.toString());
        return "添加";
    }


}

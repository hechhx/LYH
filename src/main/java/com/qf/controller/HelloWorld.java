package com.qf.controller;

import com.qf.entity.User;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import java.io.IOException;

/**
 * @author lyh666
 * @Date 2019/9/24 11:02
 *  /*
 *     *   method = {RequestMethod.GET,RequestMethod.POST}
 *     *   支持GET和POST请求
 *     *
 *     * */
/*    @RequestMapping(value="/hello",method = {RequestMethod.GET,RequestMethod.POST})
  *     public String hello(){
  *         System.out.println("helloWorld");
  *         return "helloWorld";
  *     }*/

             /*
  *     *   params = {"username","password"}
  *     *   限制传递的参数为username 和 password
  *     *   不符合条件则会 400
  *     *
  *     * */

@RestController()
@RequestMapping(value = "/index")
@Slf4j
public class HelloWorld {

    @RequestMapping(value = "/add",produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public String add(User user) throws IOException {
        log.debug(user.toString());

        return "张三";
    }
    @RequestMapping(value = "/getPage/{page}/{index}",produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public String getPage(@PathVariable String page,@PathVariable String index) throws IOException {
        log.debug("page:"+page);
        log.debug("index:"+index);
        return "动态路径";
    }
}

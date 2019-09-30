package com.qf.controller;

import com.qf.entity.User;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;

/**
 * @author lyh666
 * @Date 2019/9/25 17:40
 */
@RestController
@Slf4j
public class ResponseBodyController {
    @Resource
    private User user;
    /**
     * 返回jsp页面
     * 如果想返回json格式数据而不是到达jsp页面
     * 需要添加@ResponseBody
     * @return
     */
    @RequestMapping("/test2")
    @ResponseBody
    public User testResponseBody(){
        return user;
    }

    @RequestMapping("/view")
    public ModelAndView view(){
        ModelAndView modelAndView=new ModelAndView();
        user.setUsername("zs");
        modelAndView.addObject(user);
        modelAndView.setViewName("view");
        return  modelAndView;
    }
}

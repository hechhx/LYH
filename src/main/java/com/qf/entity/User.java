package com.qf.entity;

import lombok.Data;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;

/**
 * @author lyh666
 * @Date 2019/9/25 10:08
 */
@Data
@Component
public class User {
    private String username;
    private String password;
}

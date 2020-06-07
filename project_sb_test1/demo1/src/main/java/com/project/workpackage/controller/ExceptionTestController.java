package com.project.workpackage.controller;

import com.project.exception.GlobalException;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by 小白 on 2020/5/31.
 */
@RestController
@RequestMapping("/exception")
public class ExceptionTestController {

    @PostMapping("/test")
    public void exceptionTest(){
        throw new GlobalException(500, "测试异常");
    }
}

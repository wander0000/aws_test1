package com.boot.aws_test1.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class AwsController {
    @GetMapping("/aws/v1")
    public String hello(){
        log.info("/aws/v1 이 호출되었습니다~~");

        return "<h1> aws v1 호출 완료</h1>";
    }
}

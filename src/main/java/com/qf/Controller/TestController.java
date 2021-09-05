package com.qf.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * projectName: first-springboot
 *
 * @author dongshihao
 * Date:2021/9/5   19:32
 * description:
 */
@RestController
public class TestController {

    @GetMapping("/test")
    public String test(){
        return "Hello SpringBoot!";
    }

}
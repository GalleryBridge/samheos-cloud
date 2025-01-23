package com.samheos.things.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: Laidor
 * @Description: 物模型控制层
 * @Date:2025/1/20 上午 11:36
 */
@RestController
@RequestMapping("/things")
public class ThingsController {

    @GetMapping("/one")
    public String things(){
        return "Things";
    }
}

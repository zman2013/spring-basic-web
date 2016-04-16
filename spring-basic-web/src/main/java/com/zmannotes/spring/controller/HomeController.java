package com.zmannotes.spring.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.zmannotes.spring.domain.HomeResponse;

@RestController                 //标明此类是一个Controller
@RequestMapping("/home")        //标明Url根路径为/home
public class HomeController {

    @RequestMapping("hi")       //标明Url子路径为hi
    public HomeResponse hi(
            @RequestParam(name = "name", defaultValue = "hacker") String name) {

        String msg = String.format("Welcome %s", name);

        HomeResponse response = new HomeResponse(0, msg);

        return response;
    }

}

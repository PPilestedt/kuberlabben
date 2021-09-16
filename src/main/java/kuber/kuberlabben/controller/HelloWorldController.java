package kuber.kuberlabben.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by: Ulf Nyberg
 * Date: 2021-09-16
 * Time: 13:21
 * Project: kuberlabben1
 * Copyright: MIT
 */
@RestController
public class HelloWorldController {

    @GetMapping("/hello")
    public String helloWorld(){
        return "Hello World";
    }



}

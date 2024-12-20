package com.ll.sbb2;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class MainController {
    @GetMapping("/sbb2")
    @ResponseBody
    public String index(){
        return "spring, summer, autumn, winter boot";
    }
}

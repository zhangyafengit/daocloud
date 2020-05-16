package com.example.easyops;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
@ResponseBody
public class MyController {
    @Autowired
    MySvc mySvc;
    @GetMapping("/")
    public String index(){
        return "Hello spring";
    }
    @GetMapping("/add")
    public String add(int a, int b){
        return mySvc.add(a,b) + "";
    }
}

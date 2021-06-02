package com.example.test.controller;

import com.example.test.entity.Login;
import com.example.test.entity.Resp;
import com.example.test.service.ILoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

@CrossOrigin
@RestController
@RequestMapping(value = "/login")
public class LoginController {
    @Autowired
    private ILoginService iLoginService;

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    private Login login(@RequestParam String username, @RequestParam String password){
        return iLoginService.login(username, password);
    }

    @RequestMapping(value = "/login2", method = RequestMethod.POST)
    private Login login2(@RequestBody Login login){
        return iLoginService.login(login.getUsername(), login.getPassword());
    }

    @RequestMapping(value = "/upload", method = RequestMethod.POST)
    private Resp<String> upload(@RequestParam("file")MultipartFile file){
        return iLoginService.upload(file);
    }

    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    private String hello(){
        return "hello GET";
    }
}

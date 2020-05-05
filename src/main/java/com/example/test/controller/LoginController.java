package com.example.test.controller;

import com.example.test.entity.Login;
import com.example.test.entity.Resp;
import com.example.test.service.ILoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

@RestController
@RequestMapping(value = "/login")
@CrossOrigin
public class LoginController {
    @Autowired
    private ILoginService iLoginService;

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    @CrossOrigin
    private Login login(@RequestParam String username, @RequestParam String password){
        return iLoginService.login(username, password);
    }

    @RequestMapping(value = "/list", method = RequestMethod.POST)
    @CrossOrigin
    private List<Login> list(){
        return iLoginService.list();
    }

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    @CrossOrigin
    private int add(@RequestParam String username, @RequestParam String password, @RequestParam byte role){
        return iLoginService.add(username, password, role);
    }

    @RequestMapping(value = "/update", method = RequestMethod.POST)
    @CrossOrigin
    private int update(@RequestParam int id, @RequestParam String password){
        return iLoginService.update(id, password);
    }

    @RequestMapping(value = "/update_role", method = RequestMethod.POST)
    @CrossOrigin
    private int update_role(@RequestParam int id, @RequestParam byte role){
        return iLoginService.update_role(id, role);
    }

    @RequestMapping(value = "/del", method = RequestMethod.POST)
    @CrossOrigin
    private int del(@RequestParam int id){
        return iLoginService.del(id);
    }

    @RequestMapping(value = "/login2", method = RequestMethod.POST)
    @CrossOrigin
    private Login login2(@RequestBody Login login){
        return iLoginService.login(login.getUsername(), login.getPassword());
    }

    @RequestMapping(value = "/upload", method = RequestMethod.POST)
    @CrossOrigin
    private Resp<String> upload(@RequestParam("file")MultipartFile file){
        return iLoginService.upload(file);
    }
}

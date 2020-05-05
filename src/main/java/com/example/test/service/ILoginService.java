package com.example.test.service;

import com.example.test.entity.Login;
import com.example.test.entity.Resp;
import org.springframework.web.multipart.MultipartFile;
import java.util.List;


public interface ILoginService {
    Login login(String username, String password);
    List<Login> list();
    int add(String username, String password, byte role);
    int update(int id, String password);
    int update_role(int id, byte role);
    int del(int id);
    Resp<String> upload(MultipartFile file);
}

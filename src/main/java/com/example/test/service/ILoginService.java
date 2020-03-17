package com.example.test.service;

import com.example.test.entity.Login;
import com.example.test.entity.Resp;
import org.springframework.web.multipart.MultipartFile;

public interface ILoginService {
    Login login(String username, String password);
    Resp<String> upload(MultipartFile file);
}

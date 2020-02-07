package com.example.test.service;

import com.example.test.entity.Login;

public interface ILoginService {
    Login login(String username, String password);
}

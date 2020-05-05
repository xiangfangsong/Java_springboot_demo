package com.example.test.dao;

import com.example.test.entity.Login;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface ILoginDao {
    Login login(@Param("username") String username, @Param("password") String password);
    List<Login> list();
    int add(@Param("username") String username, @Param("password") String password, @Param("role") byte role);
    int update(@Param("id") int id, @Param("password") String password);
    int update_role(@Param("id") int id, @Param("role") byte role);
    int del(@Param("id") int id);
}

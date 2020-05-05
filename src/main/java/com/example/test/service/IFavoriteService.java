package com.example.test.service;

import com.example.test.entity.Favorite;
import com.example.test.entity.Resp;
import org.apache.ibatis.annotations.Param;
import org.springframework.web.multipart.MultipartFile;
import java.util.List;

public interface IFavoriteService {
    List<Favorite> list(int uid);
    int add(String wname, String wurl,int uid,byte type);
    int del(int id);
    int update(int id,String wname,String wurl,byte type);
    int count(int id);
}

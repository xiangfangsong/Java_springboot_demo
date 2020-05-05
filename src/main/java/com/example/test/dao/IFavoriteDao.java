package com.example.test.dao;

import com.example.test.entity.Favorite;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface IFavoriteDao {
    List<Favorite> list(@Param("uid") int uid);
    int add(@Param("wname") String wname, @Param("wurl") String wurl, @Param("uid") int uid, @Param("type") byte type);
    int del(@Param("id") int id);
    int update(@Param("id") int id, @Param("wname") String wname, @Param("wurl") String wurl, @Param("type") byte type);
    int count(@Param("id") int id);
}

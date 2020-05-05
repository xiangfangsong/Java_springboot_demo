package com.example.test.service.impl;

import com.example.test.dao.IFavoriteDao;
import com.example.test.entity.Favorite;
import com.example.test.entity.Resp;
import com.example.test.service.IFavoriteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.util.List;

@Service
public class FavoriteService implements IFavoriteService{
    @Autowired
    private IFavoriteDao iFavoriteDao;

    @Override
    public List<Favorite> list(int uid)
    {
        return iFavoriteDao.list(uid);
    }

    @Override
    public int add(String wname, String wurl, int uid, byte type) {
        return iFavoriteDao.add(wname, wurl, uid, type);
    }

    @Override
    public int del(int id) {
        return iFavoriteDao.del(id);
    }

    @Override
    public int update(int id, String wname, String wurl, byte type) {
        return iFavoriteDao.update(id, wname, wurl, type);
    }

    @Override
    public int count(int id) {
        return iFavoriteDao.count(id);
    }
}

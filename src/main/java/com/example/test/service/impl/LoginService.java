package com.example.test.service.impl;

import com.example.test.dao.ILoginDao;
import com.example.test.entity.Login;
import com.example.test.entity.Resp;
import com.example.test.service.ILoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.util.List;

@Service
public class LoginService implements ILoginService {
    @Autowired
    private ILoginDao iLoginDao;

    @Override
    public Login login(String username, String password) {
        return iLoginDao.login(username, password);
    }

    @Override
    public int add(String username, String password, byte role) {
        return iLoginDao.add(username, password, role);
    }

    @Override
    public int update(int id, String password) {
        return iLoginDao.update(id, password);
    }

    @Override
    public int update_role(int id, byte role) {
        return iLoginDao.update_role(id, role);
    }

    @Override
    public int del(int id) {
        return iLoginDao.del(id);
    }

    @Override
    public List<Login> list() {
        return iLoginDao.list();
    }

    @Override
    public Resp<String> upload(MultipartFile file) {
        if(file.isEmpty()){
            return Resp.fail("400","文件为空!");
        }
        String OriginalFilename = file.getOriginalFilename();
        String fileName = System.currentTimeMillis()+"."+OriginalFilename.substring(OriginalFilename.lastIndexOf(".")+1);
        String filePath = "D:\\Git\\";
        File dest = new File(filePath+fileName);
        if(!dest.getParentFile().exists())
            dest.getParentFile().mkdirs();
        try {
            file.transferTo(dest);
        }catch (Exception e){
            e.printStackTrace();
            return Resp.fail("500",OriginalFilename+"上传失败！");
        }
        return Resp.success(fileName);
    }
}

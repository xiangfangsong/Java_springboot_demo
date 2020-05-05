package com.example.test.controller;

import com.example.test.entity.Favorite;
import com.example.test.entity.Resp;
import com.example.test.service.IFavoriteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

@RestController
@RequestMapping(value = "/favorite")
@CrossOrigin

public class f2 {
    @Autowired
    private IFavoriteService iFavoriteService;

    @RequestMapping(value = "/del", method = RequestMethod.POST)
    @CrossOrigin
    private int favorite(@RequestParam int id){
        return iFavoriteService.del(id);
    }
}

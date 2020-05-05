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

public class FavoriteController {
    @Autowired
    private IFavoriteService iFavoriteService;

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    @CrossOrigin
    private int favorite(@RequestParam String wname,@RequestParam String wurl,@RequestParam int uid,@RequestParam byte type){
        return iFavoriteService.add(wname, wurl, uid, type);
    }

    @RequestMapping(value = "/update", method = RequestMethod.POST)
    @CrossOrigin
    private int favorite(@RequestParam int id,@RequestParam String wname,@RequestParam String wurl,@RequestParam byte type){
        return iFavoriteService.update(id, wname, wurl, type);
    }

    @RequestMapping(value = "/count", method = RequestMethod.POST)
    @CrossOrigin
    private int favorite(@RequestParam int id){
        return iFavoriteService.count(id);
    }
}

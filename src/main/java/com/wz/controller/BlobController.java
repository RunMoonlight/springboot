package com.wz.controller;

import com.wz.beans.UserBean;
import com.wz.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * Created by wang_zhen1 on 2017/10/16 0016.
 */
@Controller
@RequestMapping("/blob")
public class BlobController {

    @Autowired
    private IUserService iUserService;

    @RequestMapping(value = "/blobs",method = RequestMethod.GET)
    @ResponseBody
    public String getAll(){
       List<UserBean> list= iUserService.queryList();
        return list.toString();
    }
}

package com.wz.service.impl;

import com.wz.beans.UserBean;
import com.wz.dao.IUserDao;
import com.wz.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by wang_zhen1 on 2017/10/16 0016.
 */

@Service
public class IUserServiceImpl implements IUserService {
    @Autowired
    public IUserDao userDao;

    @Override
    public List<UserBean> queryList() {
        return userDao.queryList();
    }
}

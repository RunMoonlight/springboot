package com.wz.dao;

import com.wz.beans.UserBean;

import java.util.List;

public interface IUserDao {


    List<UserBean> queryList();
}

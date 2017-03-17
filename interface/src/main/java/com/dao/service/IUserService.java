package com.dao.service;

/**
 * Created by zxdong on 2017/2/5.
 */
public interface IUserService {

    /**
     * 登录方法
     * @return 是否登录成功
     */
    public boolean login(String username, String password);
}

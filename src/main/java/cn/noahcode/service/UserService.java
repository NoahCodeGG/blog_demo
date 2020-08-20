package cn.noahcode.service;

import cn.noahcode.po.User;

/**
 * @author NoahCode
 * @date 2020/8/10
 * @description
 */
public interface UserService {
    User checkUser(String username, String password);
}

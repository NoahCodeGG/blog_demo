package cn.noahcode.service;

import cn.noahcode.dao.UserRepository;
import cn.noahcode.po.User;
import cn.noahcode.util.MD5Utils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author NoahCode
 * @date 2020/8/10
 * @description
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public User checkUser(String username, String password) {
        User user = userRepository.findByUsernameAndPassword(username, MD5Utils.code(password));
        return user;
    }
}

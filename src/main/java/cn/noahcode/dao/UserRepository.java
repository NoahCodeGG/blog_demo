package cn.noahcode.dao;

import cn.noahcode.po.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author NoahCode
 * @date 2020/8/10
 * @description
 */
public interface UserRepository extends JpaRepository<User, Long> {

    User findByUsernameAndPassword(String usernam, String password);

}

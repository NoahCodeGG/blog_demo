package cn.noahcode.dao;

import cn.noahcode.po.Type;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author NoahCode
 * @date 2020/8/10
 * @description
 */

public interface TypeRepository extends JpaRepository<Type,Long> {

    Type findByName(String name);

}

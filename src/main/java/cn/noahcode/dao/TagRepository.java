package cn.noahcode.dao;

import cn.noahcode.po.Tag;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author NoahCode
 * @date 2020/8/11
 * @description
 */
public interface TagRepository extends JpaRepository<Tag, Long> {

    Tag findByName(String name);

}

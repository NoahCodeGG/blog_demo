package cn.noahcode.service;

import cn.noahcode.po.Type;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

/**
 * @author NoahCode
 * @date 2020/8/10
 * @description
 */
public interface TypeService {

    Type saveType(Type type);

    Type getType(Long id);

    Type getTypeByName(String name);

    Type updateType(Long id, Type type);

    void deleteType(Long id);

    Page<Type> listType(Pageable pageable);

    List<Type> listType();

}

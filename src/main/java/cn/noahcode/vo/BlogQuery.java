package cn.noahcode.vo;

import lombok.Data;

/**
 * @author NoahCode
 * @date 2020/8/13
 * @description
 */
@Data
public class BlogQuery {
    private String title;
    private Long typeId;
    private boolean recommend;
}

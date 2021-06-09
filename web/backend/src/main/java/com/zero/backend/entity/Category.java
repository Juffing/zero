package com.zero.backend.entity;

import lombok.Data;

/**
 * <p>
 * fa编码号的分类
 * </p>
 *
 * @author zjf
 * @since 2021-06-08
 */
@Data
public class Category {

    private static final long serialVersionUID = 1L;

    /**
     * 分类id
     */
    private String categoryCode;

    /**
     * 分类名称
     */
    private String name;

    /**
     * 0-未被删除；1-已被删除
     */
    private Boolean isDeleted;


}

package com.zero.backend.entity;

import lombok.Data;

@Data
public class Code {

    private Integer id;

    private String code;

    private String name;

    private String desc;

    private String codeCover;

    private String videoFile;

    private Integer isDeleted;

}

package com.poming.boot.entity.vo;

import lombok.Data;

import java.io.Serializable;

/**
 * @author 没个破名怎活
 * @date 2022/6/27
 **/
@Data
public class Book implements Serializable {

    private Long id;

    private String name;

    private String author;

}

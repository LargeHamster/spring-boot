package com.poming.boot.entity.pojo;

import lombok.Data;

import javax.persistence.*;

/**
 * @author 没个破名怎活
 * @date 2022/7/11
 **/
@Data
@Entity
public class Person {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String firstname;

    private String lastname;

    private String myHobby;

}

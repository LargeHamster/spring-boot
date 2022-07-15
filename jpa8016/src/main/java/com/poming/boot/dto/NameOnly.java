package com.poming.boot.dto;

/**
 * @author 没个破名怎活
 * @date 2022/7/11
 **/
public interface NameOnly {

    String getFirstname();

    String getLastname();

    Long getId();

    String getMyHobby();

    default String ToString(){
        return "NameOnly(firstname="+getFirstname()+",lastname="+getLastname()+")";
    }

}

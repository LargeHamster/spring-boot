package com.poming.boot.entity.bo;

import lombok.Data;

import javax.validation.constraints.*;

/**
 * @author 没个破名怎活
 * @date 2022/6/30
 **/
@Data
public class User {

    private Integer id;

    @Size(min = 5,max = 10,message = "{user.name.size}")
    private String name;

    @NotNull(message = "{user.address.notnull}")
    private String address;

    @DecimalMin(value = "1",message = "{user.age.size}")
    @DecimalMax(value = "200",message = "{user.age.size}")
    private Integer age;

    @Email(message = "{user.email.pattern}")
    @NotNull(message = "{user.email.pattern}")
    private String email;

}

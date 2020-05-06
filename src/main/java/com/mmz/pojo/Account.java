package com.mmz.pojo;

import lombok.Data;

import java.io.Serializable;

/**
 * @Classname Account
 * @Description TODO
 * @Date 2020/5/6 15:01
 * @Created by mmz
 */
@Data
public class Account implements Serializable {
    private Integer id ;
    private Integer uid;
    private Double money;

    private User user;

    @Override
    public String toString() {
        return "Account{" +
                "id=" + id +
                ", uid=" + uid +
                ", money=" + money +
                '}';
    }
}

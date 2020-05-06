package com.mmz.dao;

import com.mmz.pojo.Account;

import java.util.List;

/**
 * @Classname AccountDao
 * @Description TODO
 * @Date 2020/5/6 15:02
 * @Created by mmz
 */
public interface AccountDao {

    List<Account> findAll();

    List<Account> findAccountById(Integer id);
}

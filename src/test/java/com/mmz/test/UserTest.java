package com.mmz.test;

import com.mmz.dao.AccountDao;
import com.mmz.dao.UserDao;
import com.mmz.pojo.Account;
import com.mmz.pojo.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.InputStream;
import java.util.List;

/**
 * @Classname MybatisTest
 * @Description TODO
 * @Date 2020/5/4 21:35
 * @Created by mmz
 */
public class UserTest {
    private SqlSession sqlSession;
    private InputStream inputStream;
    private UserDao userDao;

    @Before
    public void init() throws Exception{
        inputStream = Resources.getResourceAsStream("SqlMapConfig.xml");
        SqlSessionFactoryBuilder   sqlSessionFactoryBuilder = new SqlSessionFactoryBuilder();
        SqlSessionFactory sqlSessionFactory = sqlSessionFactoryBuilder.build(inputStream);
        sqlSession = sqlSessionFactory.openSession();
        userDao = sqlSession.getMapper(UserDao.class);
    }

    @After
    public void end() throws Exception{
        sqlSession.commit();
        sqlSession.close();
        inputStream.close();
    }


    @Test
    public void testFindAll() {
        List<User> users = userDao.findAll();
        for(User user : users){
            System.out.println(user);
            System.out.println(user.getAccounts());
        }
    }



}

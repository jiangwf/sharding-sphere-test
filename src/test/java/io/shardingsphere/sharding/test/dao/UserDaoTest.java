package io.shardingsphere.sharding.test.dao;

import io.shardingsphere.sharding.test.AppTest;
import io.shardingsphere.sharding.unit.dao.UserDao;
import io.shardingsphere.sharding.unit.model.User;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.annotation.Rollback;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * weifeng.jiang 2018-06-26 15:43
 */
public class UserDaoTest extends AppTest{

    @Autowired
    private UserDao userDao;

    @Test
    public void testSave(){
        User user = new User();
        user.setId(10L);
        user.setCompanyCode("testb");
        user.setCreateTime(new Date());
        userDao.insert(user);
    }

    @Test
    public void testUpdateList(){
        List<User> userList = new ArrayList<>();

        User user = new User();
        user.setId(10L);
        user.setAge(20L);
        userList.add(user);

        User user1 = new User();
        user1.setId(20L);
        user1.setAge(20L);
        userList.add(user1);
        userDao.updateUserList(userList);
    }

    @Test
    @Rollback(value = false)
    public void testUser(){
        User user = new User();
        user.setId(20L);
        user.setAge(20L);
        userDao.updateUser(user);
    }

    @Test
    @Rollback(value = false)
    public void selectUser(){
        userDao.selectByExample(null);
    }
}

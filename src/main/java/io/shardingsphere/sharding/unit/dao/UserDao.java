package io.shardingsphere.sharding.unit.dao;

import io.shardingsphere.sharding.unit.model.User;

import java.util.List;

/**
 * weifeng.jiang 2018-06-26 15:52
 */
public interface UserDao extends UserMapper {

    void updateUserList(List<User> userList);

    void updateUser(User user);
}

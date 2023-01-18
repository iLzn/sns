package com.reuleaux.sns.module.before.dao;

import com.reuleaux.sns.module.before.domain.User;

import java.util.List;

public interface UserDao {
    public List<UserDao> getAllUser();

    public UserDao getUserById(String userUuid);

    public  int insertUser(User user);
}

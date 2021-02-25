package com.module.schedulerclient.repository;

import com.module.schedulerclient.model.po.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserMapper extends JpaRepository<User, Integer> {
    int selectCount(User user);
    User selectOne(User user);
    User selectByPrimaryKey(Integer userId);
    List<User> selectByExample(User user);

    void insertSelective(User user);
    void updateByPrimaryKeySelective(User user);
    void deleteByPrimaryKey(Integer userId);
}

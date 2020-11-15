package com.ammi3.userservice.service;

import com.ammi3.userservice.domain.User;
import com.ammi3.userservice.service.impl.UserServiceImpl;

import java.util.List;

public interface UserService {

    void create(User user);

    User getUser(Long id);

    void update(User user);

    void delete(Long id);

    User getByUsername(String username);

    List<User> getUserByIds(List<Long> ids);
}

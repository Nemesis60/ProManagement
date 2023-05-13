package com.ApiRest.ProManagement.Domain.User;

import java.util.List;

public interface UserRepository {
    User saveUser(User user);
    List<User> findAllUsers();
    User findUserById(Long id);
    void deleteUser(long id);
}

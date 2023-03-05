package web.dao;

import web.models.User;

import java.util.List;

public interface UserDAO {
    User findById(Long id);
    List<User> findAll();
    void saveUser(User user);
    void deleteById(Long id);
}

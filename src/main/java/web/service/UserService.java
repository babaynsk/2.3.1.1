package web.service;

import web.model.User;

import java.util.List;

public interface UserService {

    public List<User> getAllUsers();

    public void saveUser(User user);
    public User getUserById(int id);
    public void updateUser(User user);

    public void delete(int id);
}

package web.service;

import org.springframework.stereotype.Service;
import web.dao.UserDAO;
import web.model.User;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class UserServicelmpl implements UserService {
    private final UserDAO userDAO;

    public UserServicelmpl(UserDAO userDAO) {
        this.userDAO = userDAO;
    }

    @Override
    @Transactional
    public List<User> getAllUsers() {
        return userDAO.getAllUsers();
    }

    @Override
    @Transactional
    public void saveUser(User user) {
        userDAO.saveUser(user);
    }

    @Override
    @Transactional
    public User getUserById(int id) {
        return userDAO.getUserById(id);
    }

    @Override
    @Transactional
    public void updateUser(User user,int id) {
        userDAO.updateUser(user,id);
    }

    @Override
    @Transactional
    public void delete(int id) {
        userDAO.delete(id);
    }
}
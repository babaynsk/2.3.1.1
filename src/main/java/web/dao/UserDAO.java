package web.dao;

import org.springframework.stereotype.Component;
import web.model.User;

import java.util.List;

@Component
public interface UserDAO {
    public List<User> getAllUsers();

   public void saveUser(User user);

   public User getUserById(int id);
   public void updateUser(User user,int id);
    public void delete(int id);
}

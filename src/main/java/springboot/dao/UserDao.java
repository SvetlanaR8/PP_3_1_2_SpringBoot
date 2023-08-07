package springboot.dao;



import springboot.model.User;

import java.util.List;

public interface UserDao {

    void add(User user);
    List<User> listUsers();

    User show(Long id);

    void update (Long id, User user);
    void delete(Long id);

}

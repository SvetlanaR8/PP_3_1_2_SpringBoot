package springboot.service;

import java.util.List;
import springboot.model.User;

public interface UserService {
    void add(User user);
    List<User> listUsers();

    User show(Long id);

    void update (Long id, User user);
    void delete(Long id);
}

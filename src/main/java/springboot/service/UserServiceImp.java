package springboot.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import springboot.dao.UserDao;
import springboot.dao.UserDaoImp;
import springboot.model.User;


import java.util.List;
@Service
public class UserServiceImp implements UserService{

    @Autowired
    private UserDao userDao = new UserDaoImp();


    @Transactional
    @Override
    public void add(User user) {
        userDao.add(user);
    }

    @Transactional
    @Override
    public User show(Long id) {
        return userDao.show(id);
    }
    @Transactional
    @Override
    public void update(Long id, User user) {
        userDao.update(id, user);
    }
    @Transactional
    @Override
    public void delete(Long id) {
        userDao.delete(id);
    }

    @Transactional(readOnly = true)
    @Override
    public List<User> listUsers() {
        return userDao.listUsers();
    }
}

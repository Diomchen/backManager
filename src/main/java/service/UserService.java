package service;

import bean.User;
import dao.UserDao;

import java.util.List;

public class UserService {
    private UserDao userDao = new UserDao();

    public List<User> getUserList(){
        return userDao.getUserList();
    }

    public User getUserById(int id){
        return userDao.getUserById(id);
    }

    public boolean deleteUserById(int id){
        return userDao.deleteUserById(id);
    }

}

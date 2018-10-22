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

    public void deleteUserById(int id){
        userDao.deleteUserById(id);
    }

    public void updateUserByUser(User user){ userDao.updateUserByUser(user);}

    public void unlockId(int id){
        userDao.unlockId(id);
    }
}

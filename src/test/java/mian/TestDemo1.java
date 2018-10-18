package mian;

import bean.User;
import dao.UserDao;
import utils.sqlSessionFactoryUtils;

import java.util.List;

public class TestDemo1 {
    public static void main(String[] args) {
        UserDao ud = new UserDao();
        List<User> userList = ud.getUserList();
        sqlSessionFactoryUtils.closeSqlSession();
        for(User x:userList){
            System.out.println(x.getAge()+"---"+x.getNickname()+"---"+x.getGender());
        }
    }
}

package dao;

import bean.User;
import mapper.userMapper;
import org.apache.ibatis.session.SqlSession;
import utils.sqlSessionFactoryUtils;

import java.util.List;

public class UserDao {

    private List<User> user = null;
    private SqlSession sqlSession = null;

    public List<User> getUserList(){
        sqlSession = sqlSessionFactoryUtils.openSqlSession();
        userMapper um = sqlSession.getMapper(userMapper.class);
        sqlSession.commit();
        user = um.getUser();
        return user;
    }
}

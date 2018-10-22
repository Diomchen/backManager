package dao;

import bean.User;
import mapper.userMapper;
import org.apache.ibatis.session.SqlSession;
import utils.sqlSessionFactoryUtils;

import java.util.List;

public class UserDao {

    private List<User> user = null;
    private User u = null;
    private SqlSession sqlSession = null;

    //查找全部User的信息
    public List<User> getUserList(){
        sqlSession = sqlSessionFactoryUtils.openSqlSession();
        userMapper um = sqlSession.getMapper(userMapper.class);
        //实例化接口
        sqlSession.commit();
        user = um.getUser();
        sqlSessionFactoryUtils.closeSqlSession();
        return user;
    }

    //从ID查找User
    public User getUserById(int id){
        sqlSession = sqlSessionFactoryUtils.openSqlSession();
        userMapper um = sqlSession.getMapper(userMapper.class);
        //实例化接口
        sqlSession.commit();
        u = um.getUserById(id);
        sqlSessionFactoryUtils.closeSqlSession();
        return u;
    }

    //通过ID删除一个用户
    public void deleteUserById(int id){
        sqlSession = sqlSessionFactoryUtils.openSqlSession();
        userMapper um = sqlSession.getMapper(userMapper.class);
        um.deleteUserById(id);
        sqlSession.commit();
        sqlSessionFactoryUtils.closeSqlSession();
    }

}

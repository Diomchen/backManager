package mian;

import bean.User;
import mapper.userMapper;
import org.apache.ibatis.session.SqlSession;
import utils.sqlSessionFactoryUtils;

import java.util.List;

public class Test {
    public static void main(String[] args) {
        SqlSession sqlSession = sqlSessionFactoryUtils.openSqlSession();
        userMapper um = sqlSession.getMapper(userMapper.class);
//        List<User> u = sqlSession.selectList("userList");
        sqlSession.commit();
        User user = um.getUser(1);

//        for(User x:u){
//            System.out.println(x.getId()+"----"+x.getGender());
//        }

        System.out.println(user.getId()+"---"+user.getNickname());
        if(sqlSession!=null){
            sqlSession.close();
        }
    }
}

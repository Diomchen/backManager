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
        //利用 sqlSession.getMapper获取 接口实例
        sqlSession.commit();
//        User user = um.getUser(1);
//        System.out.println(user.getId()+"---"+user.getAge()+"---"+user.getGender()+"---"+user.getCreateTime()+"---"+user.getUserStatus());
        if( sqlSession!=null ){
            sqlSession.close();
        }
    }
}

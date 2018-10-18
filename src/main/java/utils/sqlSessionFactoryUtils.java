package utils;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

public class sqlSessionFactoryUtils{
    private static SqlSessionFactory sqlSessionFactory = null;
//    下面是类线程锁
    private static final Class CLASS_LOCK = SqlSessionFactory.class;
//    私有化对象，防止被多次使用造成资源浪费
    private sqlSessionFactoryUtils(){}

    public static SqlSessionFactory initSqlsessionFactory(){
        String resources = "mybatisConfig/mybatisConfig.xml";
        InputStream inputStream = null;
        try {
            inputStream = Resources.getResourceAsStream(resources);
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("error : resources解析错误");
        }
//        同步锁
        synchronized (CLASS_LOCK){
            if(sqlSessionFactory == null){
                sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
            }
        }
        return sqlSessionFactory;
    }

    public static SqlSession openSqlSession(){
        if(sqlSessionFactory == null){
            initSqlsessionFactory();
        }
        return sqlSessionFactory.openSession();
    }
}

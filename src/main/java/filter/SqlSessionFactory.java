package filter;

import utils.sqlSessionFactoryUtils;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

public class SqlSessionFactory implements ServletContextListener {
    public void contextInitialized(ServletContextEvent sce) {
        sqlSessionFactoryUtils.initSqlsessionFactory();
    }

    public void contextDestroyed(ServletContextEvent sce) {
        sqlSessionFactoryUtils.closeSqlSession();
    }
}

package me.ezerror.dao.config;

import me.ezerror.dao.datasource.DynamicDataSource;
import me.ezerror.dao.util.MapWrapperFactory;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.annotation.Resource;

@Configuration
public class MyBatisConfig {

    @Resource(name = "dynamicDataSource")
    private DynamicDataSource dynamicDataSource;

    @Bean
    public SqlSessionFactory sqlSessionFactory() throws Exception {
        SqlSessionFactoryBean sqlSessionFactoryBean = new SqlSessionFactoryBean();
        sqlSessionFactoryBean.setObjectWrapperFactory(new MapWrapperFactory());
        sqlSessionFactoryBean.setDataSource(dynamicDataSource);
        sqlSessionFactoryBean.setTypeAliasesPackage("me.ezerror.pojo");
        return sqlSessionFactoryBean.getObject();
    }

    @Bean
    public SqlSessionTemplate financialMasterSqlSessionTemplate(SqlSessionFactory sqlSessionFactory) {
        return new SqlSessionTemplate(sqlSessionFactory);
    }

}
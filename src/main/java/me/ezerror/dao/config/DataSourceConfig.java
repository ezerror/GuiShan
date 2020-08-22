package me.ezerror.dao.config;

import com.alibaba.druid.pool.DruidDataSource;
import me.ezerror.dao.datasource.DynamicDataSource;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

@Configuration
public class DataSourceConfig {
    @Bean(name = "defaultDataSource")
    @ConfigurationProperties(prefix = "jdbc")
    public DataSource defaultDataSource() {
        return new DruidDataSource();
    }

    @Bean(name = "dynamicDataSource")
    public DynamicDataSource dynamicDataSource() {
        return new DynamicDataSource();
    }
}
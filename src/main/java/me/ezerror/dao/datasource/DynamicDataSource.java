package me.ezerror.dao.datasource;

import me.ezerror.dao.util.DataSourceContextHolder;
import org.springframework.jdbc.datasource.AbstractDataSource;

import javax.annotation.Resource;
import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

/**
 * 动态数据源管理类
 */
public class DynamicDataSource extends AbstractDataSource {

    @Resource(name = "defaultDataSource")
    private DataSource defaultDs;

    protected DataSource determineTargetDataSource() {
        DataSource dataSource = DataSourceContextHolder.getDataSource();
        if (dataSource == null) {
            return defaultDs;
        }
        return dataSource;
    }

    @Override
    public Connection getConnection() throws SQLException {
        return determineTargetDataSource().getConnection();
    }

    @Override
    public Connection getConnection(String username, String password) throws SQLException {
        return determineTargetDataSource().getConnection(username, password);
    }
}
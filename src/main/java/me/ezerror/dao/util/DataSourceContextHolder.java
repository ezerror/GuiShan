package me.ezerror.dao.util;

import com.alibaba.druid.pool.DruidDataSource;

import javax.sql.DataSource;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class DataSourceContextHolder {
    // 当前线程使用的数据源，为null表示默认数据源
    private static final ThreadLocal<DataSource> contextHolder = new InheritableThreadLocal<DataSource>();
    // 当前线程使用过的数据源,方便事务
    private static final List<DataSource> dataSources = new ArrayList<>();
    // 全局外部数据源缓存
    private static final HashMap<String, DataSource> map = new HashMap<>();

    // 设置当前线程的数据源
    public static void setDataSource(DruidDataSource datasource) {
        if (!map.containsKey(datasource.getUrl())) {
            contextHolder.set(datasource);
            map.put(datasource.getUrl(), datasource);
        }
        else {
            contextHolder.set(map.get(datasource.getUrl()));
        }
        dataSources.add(contextHolder.get());
    }

    // 获取数据源
    public static DataSource getDataSource() {
        return contextHolder.get();
    }

    // 获取数据源
    public static List<DataSource> getThreadDataSources() {
        return dataSources;
    }

    public static void clearCache() {
        map.clear();
    }

    public static void clearDataSource() {
        contextHolder.remove();
    }

}
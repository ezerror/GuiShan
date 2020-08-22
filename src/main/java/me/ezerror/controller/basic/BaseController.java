package me.ezerror.controller.basic;

import me.ezerror.controller.annotation.BaseClass;
import me.ezerror.dao.basic.pojo.grammar.BaseEntity;
import me.ezerror.service.QueryService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * @author :ezerror
 * @date :2019/10/26
 * @desvription :
 */
public abstract class BaseController<T extends BaseEntity> {

    @Autowired
    protected QueryService<T> queryService;

    private final Class<? extends BaseEntity> baseClass = getClass().getAnnotation(BaseClass.class).value();

    public List<T> findList() {
        return queryService.findList(baseClass);
    }
}


//        DruidDataSource dataSource = new DruidDataSource();
//        dataSource.setUrl("jdbc:mysql://127.0.0.1:3306/mingding?useUnicode=true&characterEncoding=UTF-8&serverTimezone=UTC");
//        dataSource.setPassword("shiyuan");
//        dataSource.setUsername("root");
//        DataSourceContextHolder.setDataSource(dataSource);
//        List<Moment> moments = recordService.findMoment();
//        DataSourceContextHolder.clearDataSource();
//        List<App> apps2 = recordService.findApp();
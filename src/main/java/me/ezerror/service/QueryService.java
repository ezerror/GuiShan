package me.ezerror.service;

import me.ezerror.dao.basic.pojo.grammar.BaseEntity;
import me.ezerror.dao.mapper.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.lang.reflect.ParameterizedType;
import java.util.List;

/**
 * @author :ezerror
 * @date :2019/10/28
 * @desvription :
 */
@Service
public class QueryService<T extends BaseEntity> {

    @Autowired
    private Mapper<T> mapper;

    public List<T> findList(Class<? extends BaseEntity> baseClass) {
        return mapper.findList(baseClass);
    }

    public Class<T> getTClass() {
        Class<T> tClass = (Class<T>) ((ParameterizedType) getClass().getGenericSuperclass()).getActualTypeArguments()[0];
        return tClass;
    }

}

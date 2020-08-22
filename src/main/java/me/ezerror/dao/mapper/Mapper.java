package me.ezerror.dao.mapper;

import me.ezerror.dao.basic.pojo.grammar.BaseEntity;
import org.apache.ibatis.annotations.SelectProvider;

import java.util.List;

/**
 * @author :师源
 * @date :2019/10/27
 * @desvription :
 */
public interface Mapper<T extends BaseEntity> {

    @SelectProvider(type = MapperProvider.class, method = "findList")
    List<T> findList(Class<? extends BaseEntity> baseClass);
}

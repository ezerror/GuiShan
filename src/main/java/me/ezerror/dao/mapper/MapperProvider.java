package me.ezerror.dao.mapper;

import me.ezerror.dao.annotation.Table;
import me.ezerror.dao.basic.pojo.grammar.BaseEntity;

public class MapperProvider {

    public String findList(Class<? extends BaseEntity> baseClass) {
        Table table = baseClass.getAnnotation(Table.class);
        String sql = "SELECT * FROM " + table.name();
        System.out.println(sql);
        return sql;
    }
}

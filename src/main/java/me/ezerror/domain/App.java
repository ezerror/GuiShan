package me.ezerror.domain;

import me.ezerror.dao.annotation.Table;
import me.ezerror.dao.basic.pojo.grammar.BaseEntity;

/**
 * 柜山记录实体类
 */
@Table(name = "app")
public class App extends BaseEntity {

    public String getAppName() {
        return getStr("appName");
    }

    public void setAppName(String appName) {
        set("appName", appName);
    }

}
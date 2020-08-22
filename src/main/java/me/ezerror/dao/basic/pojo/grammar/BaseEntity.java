package me.ezerror.dao.basic.pojo.grammar;

import java.io.Serializable;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class BaseEntity extends HashMap<String, Object> implements Serializable {
    private Set<String> changedColumns = new HashSet<>();

    public String getStr(String key) {
        return (String) this.get(key.toLowerCase());
    }

    public void set(String key, Object value) {
        this.put(key.toLowerCase(), value);
        changedColumns.add(key);
    }

    public Set<String> getChangedColumns() {
        return changedColumns;
    }
}

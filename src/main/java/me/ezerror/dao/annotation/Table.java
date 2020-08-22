package me.ezerror.dao.annotation;

import me.ezerror.dao.basic.pojo.grammar.BaseEntity;

import java.lang.annotation.*;

@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE})
public @interface Table {
    String name();
}

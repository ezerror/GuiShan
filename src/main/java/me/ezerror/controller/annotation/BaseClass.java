package me.ezerror.controller.annotation;

import me.ezerror.dao.basic.pojo.grammar.BaseEntity;

import java.lang.annotation.*;

@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Inherited
public @interface BaseClass {
    Class<? extends BaseEntity> value();
}

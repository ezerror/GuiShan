package me.ezerror.dao.util;

import org.apache.ibatis.reflection.MetaObject;
import org.apache.ibatis.reflection.ReflectionException;
import org.apache.ibatis.reflection.wrapper.ObjectWrapper;
import org.apache.ibatis.reflection.wrapper.ObjectWrapperFactory;

public class DefaultObjectWrapperFactory implements ObjectWrapperFactory {
    public boolean hasWrapperFor(Object object) {
        return false;
    }

    public ObjectWrapper getWrapperFor(MetaObject metaObject, Object object) {
        throw new ReflectionException(
                "The DefaultObjectWrapperFactory should never be called to provide an ObjectWrapper.");
    }
}
package me.ezerror.service;

import me.ezerror.domain.App;

import java.util.List;

public interface IQueryService<T> {

    public List<T> findList();
}

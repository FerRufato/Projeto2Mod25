package br.com.ferufato.Dao.generic;

import java.util.List;

public abstract class GenericService<T, K> implements IGenericService<T, K> {
    protected br.com.ferufato.Dao.generic.GenericDAO<T, K> dao;

    public GenericService(GenericDAO<T, K> dao) {
        this.dao = dao;
    }

    @Override
    public Boolean salvar(K key, T entity) {
        return dao.salvar(key, entity);
    }

    @Override
    public T buscarPorChave(K key) {
        return dao.buscarPorChave(key);
    }

    @Override
    public Boolean excluir(K key) {
        return dao.excluir(key);
    }

    @Override
    public Boolean alterar(K key, T entity) {
        return dao.alterar(key, entity);
    }


}
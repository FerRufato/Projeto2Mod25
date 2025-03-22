package br.com.ferufato.Dao.generic;

import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;

public abstract class GenericDAO<T, K> {
    protected Map<K, T> datastore = new HashMap<>();

    public Boolean salvar(K key, T entity) {
        datastore.put(key, entity);
        return true;
    }

    public T buscarPorChave(K key) {
        return datastore.get(key);
    }

    public Boolean excluir(K key) {
        return datastore.remove(key) != null;
    }

    public Boolean alterar(K key, T entity) {
        if (datastore.containsKey(key)) {
            datastore.put(key, entity);
            return true;
        }
        return false;
    }


}
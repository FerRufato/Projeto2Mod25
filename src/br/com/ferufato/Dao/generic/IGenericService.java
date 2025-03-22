package br.com.ferufato.Dao.generic;

import java.util.List;

public interface IGenericService<T, K> {
    Boolean salvar(K key, T entity);
    T buscarPorChave(K key);
    Boolean excluir(K key);
    Boolean alterar(K key, T entity);
    List<T> listarPaginado(int pageNumber, int pageSize);
}
package br.com.ferufato.Dao;

import br.com.ferufato.Dao.generic.IGenericDao;
import br.com.ferufato.domain.Cliente;

public class ClienteDAOMock implements IClienteDAO {

    @Override
    public Boolean salvar(Cliente cliente) {
       return true;

    }

    @Override
    public Cliente buscarPorCPF(Long cpf) {
       Cliente cliente = new Cliente();
       cliente.setCpf(cpf);

        return cliente;
    }

    @Override
    public Boolean excluir(long cpf) {
        return true;
    }

    @Override
    public void alterar(long cpf) {

    }

    /**
     * @param cliente
     */
    @Override
    public void alterar(Cliente cliente) {

    }

    public static class ClienteDAO extends IGenericDao.GenericDAO<Cliente, Long> {
        // Additional methods specific to ClienteDAO can be added here
    }
}

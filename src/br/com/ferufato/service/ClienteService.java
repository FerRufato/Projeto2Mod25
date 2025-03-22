package br.com.ferufato.service;

import br.com.ferufato.Dao.ClienteDAOMock;
import br.com.ferufato.Dao.IClienteDAO;
import br.com.ferufato.domain.Cliente;

public class ClienteService implements IClienteService {

    private final IClienteDAO clienteDAO;


    public ClienteService(IClienteDAO clienteDAO) {
        this.clienteDAO = clienteDAO;
    }

    @Override
    public Boolean salvar(Cliente cliente) {
        return clienteDAO.salvar(cliente);
    }

    @Override
    public String buscarPorCPF(Long cpf) {

        return "Cliente encontrado";
    }

    @Override
    public Boolean excluir(long cpf) {
        return null;
    }

    @Override
    public void excluirCliente() {
        ClienteDAOMock.ClienteDAO clienteDAO = new ClienteDAOMock.ClienteDAO();


    }


    @Override
    public Boolean alterar(Cliente clienteAlterado) {
        return true;
    }


    public void main() {
    }

}

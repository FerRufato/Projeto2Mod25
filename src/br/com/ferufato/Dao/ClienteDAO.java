package br.com.ferufato.Dao;

import br.com.ferufato.domain.Cliente;

public class ClienteDAO implements IClienteDAO {

    @Override
    public Boolean salvar(Cliente cliente) {
      return true;
    }

    @Override
    public Cliente buscarPorCPF(Long cpf) {  // Agora retorna um Cliente válido
        Cliente cliente = new Cliente();
        cliente.setCpf(cpf);
        cliente.setNome("Cliente Teste");
        cliente.setCidade("São Paulo");
        cliente.setEstado("SP");
        cliente.setEnd("Rua Exemplo");
        cliente.setNumero(123);
        cliente.setTel(11999999999L);
        return cliente;
    }

    @Override
    public Boolean excluir(long cpf) {
        return null;
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


}

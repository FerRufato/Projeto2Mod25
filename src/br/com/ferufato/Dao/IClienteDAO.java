package br.com.ferufato.Dao;

import br.com.ferufato.domain.Cliente;

public interface IClienteDAO {
    Boolean salvar(Cliente cliente);
    Cliente buscarPorCPF(Long cpf);  // Agora retorna Cliente, e não void

    Boolean excluir(long cpf);

    void alterar(long cpf);

    void alterar(Cliente cliente);
}

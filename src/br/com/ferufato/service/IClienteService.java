package br.com.ferufato.service;

import br.com.ferufato.domain.Cliente;

public interface IClienteService {
    Boolean salvar(Cliente cliente);

    String buscarPorCPF(Long cpf);

    Boolean excluir(long cpf);

    Boolean alterar(Cliente clienteAlterado);

    void excluirCliente();
}


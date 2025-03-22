package br.com.ferufato.test;

import br.com.ferufato.Dao.ClienteDAOMock;
import br.com.ferufato.Dao.IClienteDAO;

import br.com.ferufato.domain.Cliente;
import br.com.ferufato.service.ClienteService;
import br.com.ferufato.service.IClienteService;
import org.junit.Assert;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ClienteServiceTest {

    private final IClienteService clienteService;
    private Cliente cliente;



    public ClienteServiceTest() {
        IClienteDAO dao = new ClienteDAOMock();
        this.clienteService = new ClienteService(dao);
    }
    @BeforeEach
    public void init () {
        cliente = new Cliente();
        cliente.setCpf(12345678901L);
        cliente.setNome("Fernanda");
        cliente.setCidade("São Paulo");
        cliente.setEstado("SP");
        cliente.setEnd("end");
        cliente.setNumero(123);
        cliente.setTel(13999999999L);


    }

    @Test
    public void pesquisarCliente() {
        String clienteConsultado = clienteService.buscarPorCPF(cliente.getCpf());
        Assertions.assertNotNull(clienteConsultado);
    }

    @Test
    public void salvarCliente() {
        Boolean retorno = clienteService.salvar(cliente);

        Assert.assertTrue(retorno);

    }

    @Test
    public void excluirCliente() {
        clienteService.excluirCliente();

    }

    @Test
    public void alterarCliente() {
        Boolean retorno = clienteService.alterar(cliente);
        Assert.assertTrue(retorno);
    }
}



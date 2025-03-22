package br.com.ferufato.test;

import br.com.ferufato.Dao.ClienteDAOMock;
import br.com.ferufato.Dao.IClienteDAO;
import br.com.ferufato.domain.Cliente;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ClienteDaoTest {

    private IClienteDAO clienteDao;
    private Cliente cliente;
    public ClienteDaoTest() {
       clienteDao = new ClienteDAOMock();
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
        clienteDao.salvar(cliente);

    }

    @Test
    public void pesquisarCliente() {
         Cliente clienteConsultado = clienteDao.buscarPorCPF(cliente.getCpf());
        Assertions.assertNotNull(clienteConsultado);
    }

    @Test
    public void salvarCliente() {
        Boolean retorno = clienteDao.salvar(cliente);
        Assertions.assertTrue(retorno);
    }
    @Test
    public void excluirCliente() {
        Boolean retorno = clienteDao.excluir(cliente.getCpf());
        Assertions.assertTrue(retorno);
    }

    @Test
    public void alterarCliente() {
        cliente.setNome("Fernanda Rufato");
        clienteDao.alterar(cliente.getCpf());
    }

}

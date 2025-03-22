# Projeto de DAO e Serviço Genérico

Este projeto demonstra uma implementação genérica de Data Access Object (DAO) e Serviço em Java. Ele fornece uma estrutura reutilizável para realizar operações CRUD (Create, Read, Update, Delete) em diferentes entidades.

## Estrutura do Projeto

- `src/br/com/ferufato/Dao/generic/`
  - `GenericDAO.java`: Classe abstrata que define operações CRUD genéricas.
  - `IGenericDao.java`: Interface para o DAO genérico.
  - `GenericService.java`: Classe abstrata que implementa `IGenericService` e usa `GenericDAO` para operações CRUD.
  - `IGenericService.java`: Interface para o serviço genérico.

- `src/br/com/ferufato/dao/`
  - `ClienteDAO.java`: Estende `GenericDAO` para a entidade `Cliente`.

- `src/br/com/ferufato/service/`
  - `ClienteService.java`: Estende `GenericService` para a entidade `Cliente`.
  - `IClienteService.java`: Interface para o serviço de `Cliente`.

## Como Usar

1. **Crie uma nova entidade**:
   Defina sua classe de entidade, por exemplo, `Cliente`.

2. **Crie um DAO para a entidade**:
   Estenda `GenericDAO` para sua entidade, por exemplo, `ClienteDAO`.

3. **Crie um serviço para a entidade**:
   Estenda `GenericService` para sua entidade, por exemplo, `ClienteService`.

4. **Defina métodos específicos, se necessário**:
   Adicione quaisquer métodos adicionais específicos para sua entidade nas classes DAO e serviço.

## Exemplo

### Classe de Entidade

```java
package br.com.ferufato.domain;

public class Cliente {
    private Long id;
    private String name;

    // Getters e setters
}


package br.com.ferufato.dao;

import br.com.ferufato.domain.Cliente;
import br.com.ferufato.Dao.generic.GenericDAO;

public class ClienteDAO extends GenericDAO<Cliente, Long> {
    // Métodos adicionais específicos para ClienteDAO podem ser adicionados aqui
}


package br.com.ferufato.service;

import br.com.ferufato.dao.ClienteDAO;
import br.com.ferufato.domain.Cliente;
import br.com.ferufato.Dao.generic.GenericService;

public class ClienteService extends GenericService<Cliente, Long> implements IClienteService {

    public ClienteService(ClienteDAO dao) {
        super(dao);
    }

    // Implemente métodos específicos para Cliente, se necessário
}

## Licença

Este projeto é licenciado sob a Licença MIT. Veja o arquivo `LICENSE` para mais detalhes.

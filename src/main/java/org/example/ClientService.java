package org.example;

import org.example.entities.Client;
import org.example.repositories.ClientCrud;

public class ClientService {
    private ClientCrud clientCrud = new ClientCrud();

    public void saveClient(Client client) {
        clientCrud.save(client);
    }

    public Client findClientById(Long id) {
        return clientCrud.getById(id);
    }

    public void updateClient(Client client) {
        clientCrud.update(client);
    }

    public void deleteClient(Client client) {
        clientCrud.delete(client);
    }
}

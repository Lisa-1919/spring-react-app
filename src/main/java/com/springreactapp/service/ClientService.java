package com.springreactapp.service;

import com.springreactapp.domain.Client;

import java.util.List;

public interface ClientService {

    List<Client> readAll();
    Client getClientById(Integer id);
    void delete(Integer id);
    void add(Client client);
    void update(Client client);
}

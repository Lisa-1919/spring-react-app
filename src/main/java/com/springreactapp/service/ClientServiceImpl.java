package com.springreactapp.service;

import com.springreactapp.domain.Client;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClientServiceImpl implements ClientService{
    @Override
    public List<Client> readAll() {
        return null;
    }

    @Override
    public Client getClientById(Integer id) {
        return null;
    }

    @Override
    public void delete(Integer id) {

    }

    @Override
    public void add(Client client) {

    }

    @Override
    public void update(Client client) {

    }
}

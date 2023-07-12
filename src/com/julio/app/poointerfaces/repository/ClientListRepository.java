package com.julio.app.poointerfaces.repository;

import com.julio.app.poointerfaces.models.Client;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ClientListRepository implements CrudRepository<Client>, OrderedRepository<Client>, PaginableRepository<Client> {

    private List<Client> dataSource;

    public ClientListRepository() {
        this.dataSource = new ArrayList<>();
    }

    @Override
    public List<Client> list() {
        return dataSource;
    }

    @Override
    public Client getById(Integer id) {
         return dataSource.stream()
                 .filter(client -> client.getId()==id)
                 .findAny()
                 .orElse(null);
    }

    @Override
    public void create(Client client) {
        this.dataSource.add(client);

    }

    @Override
    public void update(Client client) {
    Client c = this.getById(client.getId());
    c.setName(client.getName());
    c.setLastName(client.getLastName());

    }

    @Override
    public void delete(Integer id) {
        this.dataSource.remove(this.getById(id));
    }

    @Override
    public List<Client> list(String campo, Direction dir) {
        List<Client> orderedList = new ArrayList<>(this.dataSource);
        orderedList.sort((a, b) -> {
            int result = 0;
            if(dir == Direction.ASC){
                switch (campo){
                    case "id" ->
                        result = a.getId().compareTo(b.getId());
                    case "name" ->
                        result = a.getName().compareTo(b.getName());
                    case "lastName" ->
                        result = a.getLastName().compareTo(b.getLastName());
                }

            } else if (dir == Direction.DESC) {
                switch (campo){
                    case "id" ->
                            result = b.getId().compareTo(a.getId());
                    case "name" ->
                            result = b.getName().compareTo(a.getName());
                    case "lastName" ->
                            result = b.getLastName().compareTo(a.getLastName());
                }
            }
            return result;
        });
        return orderedList;
    }

    @Override
    public List<Client> list(int start, int end) {
        return dataSource.subList(start, end);
    }
}

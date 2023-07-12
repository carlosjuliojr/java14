package com.julio.app.poointerfaces;

import com.julio.app.poointerfaces.models.Client;
import com.julio.app.poointerfaces.repository.*;

import java.util.List;

public class MainRepository {
    public static void main(String[] args) {
        CrudRepository repo = new ClientListRepository();

        repo.create(new Client("Julio","Jaimes"));
        repo.create(new Client("Ronald","Sulbaran"));
        repo.create(new Client("Ana","PErez"));
        repo.create(new Client("Yohana","Teran"));
        repo.create(new Client("Betoben","Manacho"));
        repo.create(new Client("Fabian","Lenoidas"));

        List<Client> clients = repo.list();

        clients.forEach(System.out::println);

        System.out.println("**********Paginable repository************");
        List<Client> paginable = ((PaginableRepository)repo).list(1,3);
        paginable.forEach(System.out::println);

        System.out.println("**********Order repository ASC************");
        List<Client> orderredASC = ((OrderedRepository)repo).list("name", Direction.ASC);
        orderredASC.forEach(System.out::println);

        System.out.println("**********Order repository by lastName DESC************");
        List<Client> orderredDESC = ((OrderedRepository)repo).list("lastName", Direction.DESC);
        orderredDESC.forEach(System.out::println);
        System.out.println("**********Order repository by id DESC************");
        ((OrderedRepository)repo).list("id", Direction.DESC).forEach(System.out::println);

        System.out.println("**********Update data************");
        Client clientToUpdate = new Client("Julio", "Jaimes Rodriguez");
        clientToUpdate.setId(1);
        repo.update(clientToUpdate);
        clients.forEach(System.out::println);

        System.out.println("**********Delete by id************");
        repo.delete(3);
        clients.forEach(System.out::println);

    }
}

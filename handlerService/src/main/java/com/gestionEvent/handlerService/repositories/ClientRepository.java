package com.gestionEvent.handlerService.repositories;

import com.gestionEvent.handlerService.entities.Client;

import java.util.List;

// import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface ClientRepository extends CrudRepository <Client, Long> { 

    // List<Client> findByMotDePasse(@Param("motDePasse") String motDePasse);

    // List<Client> findByPrenom(@Param("prenom") String prenom);

    // List<Client> findByNom(@Param("nom") String nom);
}


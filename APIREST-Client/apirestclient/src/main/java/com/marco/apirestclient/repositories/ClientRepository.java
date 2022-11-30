package com.marco.apirestclient.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.marco.apirestclient.entities.Client;

@Repository
public interface ClientRepository extends JpaRepository<Client, Long>{

}

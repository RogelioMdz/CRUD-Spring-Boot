package com.crudspring.crudspring.interfaces;

import com.crudspring.crudspring.model.Persona;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonaInterfaces extends CrudRepository<Persona, Integer> {

}

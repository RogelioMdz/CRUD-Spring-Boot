package com.crudspring.crudspring.interfaces;

import com.crudspring.crudspring.model.Persona;
import org.springframework.data.repository.CrudRepository;

public interface PersonaInterfaces extends CrudRepository<Persona, Integer> {

}

package com.crudspring.crudspring.services;

import com.crudspring.crudspring.interfaceServices.PersonaInterfacesServices;
import com.crudspring.crudspring.interfaces.PersonaInterfaces;
import com.crudspring.crudspring.model.Persona;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;

public class PersonaServices implements PersonaInterfacesServices {

    @Autowired
    private PersonaInterfaces data;

    @Override
    public List<Persona> mostrar() {
        return (List<Persona>)data.findAll();
    }

    @Override
    public Optional<Persona> monstrarId(int id) {
        return Optional.empty();
    }

    @Override
    public int save(Persona p) {
        return 0;
    }

    @Override
    public void delete(int id) {

    }
}

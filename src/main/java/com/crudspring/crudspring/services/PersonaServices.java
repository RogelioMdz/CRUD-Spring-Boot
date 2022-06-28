package com.crudspring.crudspring.services;

import com.crudspring.crudspring.interfaceServices.PersonaInterfacesService;
import com.crudspring.crudspring.interfaces.PersonaInterfaces;
import com.crudspring.crudspring.model.Persona;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class PersonaServices implements PersonaInterfacesService {

    @Autowired
    private PersonaInterfaces data;

    @Override
    public List<Persona> listar() {
        return (List<Persona>)data.findAll();
    }

    @Override
    public Optional<Persona> listarId(int id) {
        return Optional.empty();
    }

    @Override
    public int save(Persona p) {
        int res = 0;
        Persona persona = data.save(p);
        if (!persona.equals(null)){
            res=0;
        }
        return 0;
    }

    @Override
    public void delete(int id) {

    }
}

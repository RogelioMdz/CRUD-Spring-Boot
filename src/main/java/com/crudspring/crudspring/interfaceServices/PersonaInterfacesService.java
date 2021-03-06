package com.crudspring.crudspring.interfaceServices;

import com.crudspring.crudspring.model.Persona;

import java.util.List;
import java.util.Optional;

public interface PersonaInterfacesService {
    public List<Persona>listar();
    public Optional<Persona>listarId(int id);
    public int save(Persona p);
    public void delete(int id);
}

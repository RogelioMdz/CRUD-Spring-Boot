package com.crudspring.crudspring.interfaceServices;

import com.crudspring.crudspring.model.Persona;

import java.util.List;
import java.util.Optional;

public interface PersonaInterfacesServices {
    public List<Persona>mostrar();
    public Optional<Persona>monstrarId(int id);
    public int save(Persona p);
    public void delete(int id);
}

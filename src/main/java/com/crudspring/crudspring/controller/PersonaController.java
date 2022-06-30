package com.crudspring.crudspring.controller;

import com.crudspring.crudspring.interfaceServices.PersonaInterfacesService;
import com.crudspring.crudspring.model.Persona;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping
public class PersonaController {

    @Autowired
    private PersonaInterfacesService service;

    @GetMapping("/listar")
    public String listar(Model model){
        List<Persona> personas = service.listar();
        model.addAttribute("personas", personas);
        return "index";
    }

    @GetMapping("/new")
    public String agregar(Model model){
        model.addAttribute("persona", new Persona());
        return "newPerson";
    }
    @PostMapping("/save")
    public String save(@Validated Persona p, Model model){
        service.save(p);
        return "redirect:/listar";
    }

    @GetMapping("/editar/{id}")
    public String editar(@PathVariable int id, Model model){
        java.util.Optional<Persona>persona = service.listarId(id);
        model.addAttribute("persona", persona);
        return "actualizar";
    }
    @GetMapping("/eliminar/{id}")
    public String delete(@PathVariable int id, Model model){
        service.delete(id);
        return "redirect:/listar";
    }

}

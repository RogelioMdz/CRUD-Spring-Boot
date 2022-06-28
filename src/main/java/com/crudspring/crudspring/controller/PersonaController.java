package com.crudspring.crudspring.controller;

import com.crudspring.crudspring.interfaceServices.PersonaInterfacesService;
import com.crudspring.crudspring.model.Persona;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

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

}

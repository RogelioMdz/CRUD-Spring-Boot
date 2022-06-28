package com.crudspring.crudspring.controller;

import com.crudspring.crudspring.interfaceServices.PersonaInterfacesServices;
import com.crudspring.crudspring.model.Persona;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping
public class PersonaController {

    private PersonaInterfacesServices services;

    @GetMapping("/mostrar")
    public String mostrar(Model model){
        List<Persona> persona = services.mostrar();
        model.addAttribute("persona", persona);
        return "index";
    }
}

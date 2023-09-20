package com.example.SpringBD_AD23.Controller;

import com.example.SpringBD_AD23.InterfaceService.IPersonaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping
public class PersonaController {

    @Autowired
    private IPersonaService servicio; //se debe inyectar la interface del servicio
    @GetMapping("/listar")
    public String listarPersona(Model modelo){

        modelo.addAttribute("titulo", "DATOS ESTUDIANTES");
        modelo.addAttribute("datos", servicio.listar());

        return "index";
    }
}

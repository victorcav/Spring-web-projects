package com.listaeventoapp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class EventoController {

    @RequestMapping("/cadastarEvento")
    public String form(){
        return "evento/formEvento";
    }

}

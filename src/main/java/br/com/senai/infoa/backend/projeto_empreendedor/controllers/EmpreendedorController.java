package br.com.senai.infoa.backend.projeto_empreendedor.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

import br.com.senai.infoa.backend.projeto_empreendedor.services.EmpreendedorService;


@RestController 
@RequestMapping ("/empreendedor")
public class EmpreendedorController {
    
    @Autowired 
    private EmpreendedorService empreendedorService;

    @GetMapping("/contarEmpreendedores")
    public Long contarEmpreendedores() {
        return empreendedorService.contarEmpreendedores();
    }
    
}


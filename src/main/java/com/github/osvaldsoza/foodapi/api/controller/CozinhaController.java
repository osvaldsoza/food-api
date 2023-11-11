package com.github.osvaldsoza.foodapi.api.controller;

import com.github.osvaldsoza.foodapi.api.model.CozinhaXmlWrapper;
import com.github.osvaldsoza.foodapi.domain.model.Cozinha;
import com.github.osvaldsoza.foodapi.domain.repository.CozinhaRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("cozinhas")
public class CozinhaController {

    private CozinhaRepository cozinhaRepository;

    public CozinhaController(CozinhaRepository cozinhaRepository) {
        this.cozinhaRepository = cozinhaRepository;
    }

    @GetMapping
    public List<Cozinha> listar(){
        return cozinhaRepository.findAll();
    }

    @GetMapping("/xml")
    public CozinhaXmlWrapper listarXmlWrapper(){
        return new CozinhaXmlWrapper(cozinhaRepository.findAll());
    }

    @GetMapping("/{id}")
    public Cozinha buscarPeloId(@PathVariable Long id){
        return cozinhaRepository.findById(id).get();
    }
}

package com.github.osvaldsoza.foodapi.api.controller;

import com.github.osvaldsoza.foodapi.domain.model.Estado;
import com.github.osvaldsoza.foodapi.domain.repository.EstadoRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("estados")
public class EstadoController {

    private EstadoRepository estadoRepository;

    public EstadoController(EstadoRepository estadoRepository) {
         this.estadoRepository = estadoRepository;
    }

    @GetMapping
    public List<Estado> listar(){
        return estadoRepository.findAll();
    }
 }

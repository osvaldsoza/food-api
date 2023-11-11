package com.github.osvaldsoza.foodapi.api.controller;

import com.github.osvaldsoza.foodapi.domain.model.Restaurante;
import com.github.osvaldsoza.foodapi.domain.repository.RestauranteRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("restaurantes")
public class RestauranteController {

    private RestauranteRepository restauranteRepository;

    public RestauranteController(RestauranteRepository restauranteRepository) {
        this.restauranteRepository = restauranteRepository;
    }

    @GetMapping
    public List<Restaurante> listar(){
        return restauranteRepository.findAll();
    }
}

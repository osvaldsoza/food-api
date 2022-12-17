package br.com.osvaldsoza.controller;

import br.com.osvaldsoza.domain.model.Cozinha;
import br.com.osvaldsoza.service.CozinhaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cozinhas")
public class CozinhaController {

    @Autowired
    private CozinhaService cozinhaService;

    @GetMapping
    public List<Cozinha> listar() {
        return cozinhaService.listar();
    }

    @GetMapping("/{cozinhaId}")
    public ResponseEntity<Cozinha> buscar(@PathVariable Long cozinhaId) {
        var cozinha = cozinhaService.buscar(cozinhaId);

        if (cozinha.isPresent()) {
            return ResponseEntity.ok(cozinha.get());
        }
        return ResponseEntity.notFound().build();
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Cozinha adicionar(@RequestBody Cozinha cozinha) {
        return cozinhaService.adicionar(cozinha);
    }

    @PutMapping("/{cozinhaId}")
    @ResponseStatus(HttpStatus.OK)
    public ResponseEntity<Cozinha> atualizar(@PathVariable Long cozinhaId, @RequestBody Cozinha cozinha) {
        var cozinhaAtual = cozinhaService.atualizar(cozinhaId, cozinha);
        return ResponseEntity.ok(cozinhaAtual);
    }

    @DeleteMapping("/{cozinhaId}")
    public ResponseEntity remover(@PathVariable Long cozinhaId) {
        try {
            var cozinha = cozinhaService.buscar(cozinhaId).get();
            if (cozinha != null) {
                cozinhaService.remover(cozinha);
                return ResponseEntity.noContent().build();
            }
            return ResponseEntity.notFound().build();
        } catch (DataIntegrityViolationException e) {
            return ResponseEntity.status(HttpStatus.CONFLICT).build();
        }
    }
}

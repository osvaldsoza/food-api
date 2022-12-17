package br.com.osvaldsoza.service;

import br.com.osvaldsoza.domain.model.Cozinha;
import br.com.osvaldsoza.domain.repository.CozinhaRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CozinhaService {

    @Autowired
    private CozinhaRepository cozinhaRepository;

    public List<Cozinha> listar() {
        return cozinhaRepository.findAll();
    }

    public Optional<Cozinha> buscar(Long cozinhaId) {
        return cozinhaRepository.findById(cozinhaId);
    }

    public Cozinha adicionar(Cozinha cozinha) {
        return cozinhaRepository.save(cozinha);
    }

    public Cozinha atualizar(Long cozinhaId, Cozinha cozinha) {
        var cozinhaAtual = buscar(cozinhaId);
        BeanUtils.copyProperties(cozinha, cozinhaAtual.get(), "id");
        return cozinhaRepository.save(cozinhaAtual.get());
    }

    public void remover(Cozinha cozinha) {
        cozinhaRepository.delete(cozinha);
    }
}

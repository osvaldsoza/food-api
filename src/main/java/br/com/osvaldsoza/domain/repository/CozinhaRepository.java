package br.com.osvaldsoza.domain.repository;

import br.com.osvaldsoza.domain.model.Cozinha;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CozinhaRepository extends JpaRepository<Cozinha,Long> {
}

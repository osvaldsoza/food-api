package com.github.osvaldsoza.foodapi.domain.repository;

import com.github.osvaldsoza.foodapi.domain.model.Cozinha;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CozinhaRepository extends JpaRepository<Cozinha,Long> {
}

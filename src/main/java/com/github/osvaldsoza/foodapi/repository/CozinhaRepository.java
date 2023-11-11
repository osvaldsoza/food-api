package com.github.osvaldsoza.foodapi.repository;

import com.github.osvaldsoza.foodapi.model.Cozinha;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CozinhaRepository extends JpaRepository<Cozinha,Long> {
}

package com.github.osvaldsoza.foodapi.domain.repository;

import com.github.osvaldsoza.foodapi.domain.model.Estado;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EstadoRepository extends JpaRepository<Estado,Long> {
}

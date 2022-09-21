package br.com.osvaldsoza.domain.repository;

import br.com.osvaldsoza.domain.model.Permissao;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PermissaoRepository extends JpaRepository<Permissao,Long> {
}

package br.com.osvaldsoza.domain.repository;

import br.com.osvaldsoza.domain.model.FormaPagamento;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FormaPagamentoRepository extends JpaRepository<FormaPagamento,Long> {
}

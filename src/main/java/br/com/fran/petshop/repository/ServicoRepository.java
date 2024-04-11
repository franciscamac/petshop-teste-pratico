package br.com.fran.petshop.repository;

import br.com.fran.petshop.model.Servico;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ServicoRepository extends JpaRepository<Servico, Long> {
}

package br.com.fran.petshop.repository;

import br.com.fran.petshop.model.Funcionario;

import org.springframework.data.jpa.repository.JpaRepository;

public interface FuncionarioRepository extends JpaRepository<Funcionario, Long> {
}

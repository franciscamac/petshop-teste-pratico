package br.com.fran.petshop.model;

import jakarta.persistence.*;

@Entity
public class Funcionario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String cargo;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "animal_id")
    private Animal responsavel;


    public Funcionario() {
    }

    public Funcionario(Long id, String nome, String cargo, Animal responsavel) {
        this.id = id;
        this.nome = nome;
        this.cargo = cargo;
        this.responsavel = responsavel;
    }

    public Animal getResponsavel() {
        return responsavel;
    }

    public void setResponsavel(Animal responsavel) {
        this.responsavel = responsavel;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
}


package br.com.fran.petshop.model;
import jakarta.persistence.*;

import java.util.Set;
@Entity
public class Cliente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;

    private String telefone;

    @OneToMany(mappedBy = "dono", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private Set<Animal> animais;

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

    public Set<Animal> getAnimais() {
        return animais;
    }

    public void setAnimais(Set<Animal> animais) {
        this.animais = animais;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
}
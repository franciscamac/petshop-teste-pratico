package br.com.fran.petshop.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import br.com.fran.petshop.model.Animal;

public interface AnimalRepository extends JpaRepository<Animal, Long>{
}

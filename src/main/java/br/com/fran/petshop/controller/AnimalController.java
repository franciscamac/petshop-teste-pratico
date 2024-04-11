package br.com.fran.petshop.controller;
import br.com.fran.petshop.model.Animal;
import br.com.fran.petshop.repository.AnimalRepository;
import br.com.fran.petshop.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
@Controller
public class AnimalController {
    @Autowired
    private AnimalRepository animalRepository;

    @Autowired
    private ClienteRepository clienteRepository;

    @GetMapping("/animal")
    public String mostrarFormularioAnimal(Model model) {
        model.addAttribute("animal", new Animal());
        model.addAttribute("clientes", clienteRepository.findAll());
        model.addAttribute("animais", animalRepository.findAll());
        model.addAttribute("tipo", animalRepository.findAll());
        model.addAttribute("raca", animalRepository.findAll());
        return "cadastro-animal";
    }

    @PostMapping("/animal/save")
    public String salvarAnimal(Animal animal) {
        animalRepository.save(animal);
        return "redirect:/animal";
    }
}

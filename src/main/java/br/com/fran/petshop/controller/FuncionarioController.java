package br.com.fran.petshop.controller;

import br.com.fran.petshop.model.Funcionario;
import br.com.fran.petshop.repository.AnimalRepository;
import br.com.fran.petshop.repository.FuncionarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class FuncionarioController {

    @Autowired
    private FuncionarioRepository funcionarioRepository;
    @Autowired
    private AnimalRepository animalRepository;

    @GetMapping("/funcionario")
    public String mostrarFormularioFuncionario(Model model) {
        model.addAttribute("funcionario", new Funcionario());
        model.addAttribute("animais", animalRepository.findAll());
        model.addAttribute("funcionarios", funcionarioRepository.findAll());
        return "cadastro-funcionario";
    }
    @PostMapping("/funcionario/save")
    public String salvarFuncionario(Funcionario funcionario) {
        funcionarioRepository.save(funcionario);
        return "redirect:/funcionario";
    }
}


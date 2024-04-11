package br.com.fran.petshop.controller;

import br.com.fran.petshop.model.Servico;
import br.com.fran.petshop.repository.FuncionarioRepository;
import br.com.fran.petshop.repository.ServicoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ServicoController {

    @Autowired
    private ServicoRepository servicoRepository;

    @Autowired
    private FuncionarioRepository funcionarioRepository;

    @GetMapping("/servico")
    public String mostrarFormularioServico(Model model) {
        model.addAttribute("servico", new Servico());
        model.addAttribute("funcionarios", funcionarioRepository.findAll());
        model.addAttribute("servicos", servicoRepository.findAll());
        return "cadastro-servico";
    }

    @PostMapping("/servico/save")
    public String salvarServico(Servico servico) {
        servicoRepository.save(servico);
        return "redirect:/servico";
    }
}

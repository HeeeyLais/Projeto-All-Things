package br.com.allthings.allthings.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.allthings.allthings.entity.Produto;
import br.com.allthings.allthings.service.ProdutoService;

@Controller
@RequestMapping("/produtos")
public class ProdutoController {
    @Autowired
    private ProdutoService ProdutoService;

    //métodos
    //salvar
    @PostMapping("/salvar")
    public String salvar(@ModelAttribute Produto produto){
        ProdutoService.save(produto);
        return "redirect:/produtos/listar";
    }

    // listar todos os produtos
    @GetMapping("/listar")
    public String listar(Model model){
        List<Produto> produtos = ProdutoService.findAll();
        model.addAttribute("produtos", produtos);
        return "produto/listaProdutos";
    }

    // abrir formulário
    @GetMapping("/criar")
    public String criarForm(Model model){
        model.addAttribute("produto", new Produto());
        return "produto/formularioProduto";
    }


}

package br.com.tech4me.clinica.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.tech4me.clinica.model.DadosProcedimento;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
@RequestMapping("/procedimentos")

public class ProcedimentosController {
    List<DadosProcedimento> procedimentos = new ArrayList<>();


    @GetMapping("/{descricao}")
    private String procedimentoGetComParamentro(@PathVariable String descricao){
        return String.format("Página com informações do procedimento %s", descricao);
    }

    @PostMapping
    private String procedimentoPost(@RequestBody DadosProcedimento dadosProcedimento){
        procedimentos.add(dadosProcedimento);
        return String.format("Procedimento post dados do procedimento: %s", dadosProcedimento);
    }
    
    @GetMapping
     private List<DadosProcedimento> obterListaProcedimentos(){
        return procedimentos;
     }
      
}

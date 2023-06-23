package br.com.tech4me.clinica.controller;


import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.tech4me.clinica.model.DadosMedico;

@RestController
@RequestMapping("/medicos")

public class MedicosController {

    List<DadosMedico> medicos = new ArrayList<>();
    

    @GetMapping("/{nome}")
    private String requisicaoGetComParametro(@PathVariable String nome) {
        return String.format("Página como informações do Dr(a) %s", nome);
    }

    @PostMapping
    private String requisicaoPost(@RequestBody DadosMedico dadosMedico){
        medicos.add(dadosMedico);
        return String.format("Requisição post dados do médico: %s", dadosMedico);
    }
    @GetMapping
     private List<DadosMedico> obterListaMedicos() {
        return medicos;
    }
}

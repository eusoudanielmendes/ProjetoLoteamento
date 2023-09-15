package com.poc.cadastro.controller;

import com.poc.cadastro.exceptions.PessoaNotFoundException;
import com.poc.cadastro.model.Pessoa;
import com.poc.cadastro.service.PessoaService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CadastroController {

    private final PessoaService pessoaService;

    public CadastroController(PessoaService pessoaService) {
        this.pessoaService = pessoaService;
    }

    @GetMapping("/pessoas")
    public ResponseEntity<List<Pessoa>> listaPessoas() {
        List<Pessoa> pessoas = pessoaService.listarPessoas();
        return ResponseEntity.ok(pessoas);
    }

    @GetMapping("/pessoas/{nome}")
    public ResponseEntity<Pessoa> getPessoa(@PathVariable String nome) {
        Pessoa pessoa = pessoaService.getPessoa(nome);
        if(pessoa == null) throw new PessoaNotFoundException(nome);
        return ResponseEntity.ok(pessoa);
    }

    @PostMapping("/pessoas")
    public ResponseEntity<Pessoa> cadastraPessoa(@RequestBody Pessoa pessoa) {
        Pessoa pessoaNova = pessoaService.cadastraPessoa(pessoa);
        return ResponseEntity.ok(pessoaNova);
    }

    @DeleteMapping("/pessoas/{idPessoa}")
    public void deletaPessoa(@PathVariable Long idPessoa){
        pessoaService.deletaPessoa(idPessoa);
    }
}





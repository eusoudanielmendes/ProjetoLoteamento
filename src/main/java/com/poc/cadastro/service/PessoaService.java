package com.poc.cadastro.service;

import com.poc.cadastro.model.Pessoa;
import com.poc.cadastro.repository.PessoaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PessoaService {
    @Autowired
    private PessoaRepository pessoaRepository;


    public List<Pessoa> listarPessoas(){
        return pessoaRepository.findAll();
    }

    public Pessoa getPessoa(String nome) {
        return pessoaRepository.findByNome(nome);
    }

    public Pessoa cadastraPessoa(Pessoa pessoa) {
        return pessoaRepository.save(pessoa);
    }

    public void deletaPessoa(Long idPessoa) {
        pessoaRepository.deleteById(idPessoa);
    }
}

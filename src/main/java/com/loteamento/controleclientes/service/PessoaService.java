package com.loteamento.controleclientes.service;

import com.loteamento.controleclientes.model.Pessoa;
import com.loteamento.controleclientes.repository.PessoaRepository;
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

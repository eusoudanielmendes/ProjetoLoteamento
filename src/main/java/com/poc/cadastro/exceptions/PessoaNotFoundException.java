package com.poc.cadastro.exceptions;

public class PessoaNotFoundException extends RuntimeException {
    public PessoaNotFoundException(String nome){
        super("Pessoa não encontrada: "+ nome);
    }
}

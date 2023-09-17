package com.loteamento.controleclientes.exceptions;

public class PessoaNotFoundException extends RuntimeException {
    public PessoaNotFoundException(String nome){
        super("Pessoa não encontrada: "+ nome);
    }
}

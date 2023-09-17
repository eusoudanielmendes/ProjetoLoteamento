package com.loteamento.controleclientes.controller;

import com.loteamento.controleclientes.exceptions.PessoaNotFoundException;
import com.loteamento.controleclientes.model.Cliente;
import com.loteamento.controleclientes.model.Pessoa;
import com.loteamento.controleclientes.service.ClienteServico;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ClienteControle {
    //Variável que aponta para o serviço(ClienteServico)
    private final ClienteServico clienteServico;
    //(Construtor) Injeção para o controlador poder usar o serviço
    public ClienteControle(ClienteServico clienteServico) {
        this.clienteServico = clienteServico;
    }
    @GetMapping("/clientes")
    public ResponseEntity<List<Cliente>> listarClientes() {
        //Tipo Retorno ( List<Cliente>)
        //Nome da variável (clientes)
        //Nome da variável da linha 16 (clienteServico)
        //Nome do método que está dentro da classe CLienteServico (listarClientes)

        List<Cliente> clientes = clienteServico.listarClientes();
        return ResponseEntity.ok(clientes);
    }
    @GetMapping("/clientes/{nome}")
    public ResponseEntity<Cliente> bucarPorNome(@PathVariable String nome) {
        Cliente cliente = clienteServico.bucarPorNome(nome);
        return ResponseEntity.ok(cliente);
    }
}

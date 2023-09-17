package com.loteamento.controleclientes.service;

import com.loteamento.controleclientes.model.Cliente;
import com.loteamento.controleclientes.repository.ClienteRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClienteServico {
    private final ClienteRepository clienteRepository;

    public ClienteServico(ClienteRepository clienteRepository) {
        this.clienteRepository = clienteRepository;
    }
    public List<Cliente> listarClientes(){
        return clienteRepository.findAll();
    }
    public Cliente bucarPorNome(String nome){
        return  clienteRepository.findByNome(nome);
    }

    public void deletarCliente(Cliente deletarCliente){
        clienteRepository.delete(deletarCliente);
    }
    //***ASSINATURA DO MÉTODO***:
    //Nível de acesso entre as classes java(public)
    //O tipo de retorno do método(Cliente)
    //Nome do método(cadastroCliente)
    //Parâmetro de entrada do método(Cliente)
    //Nome da variável (parâmetroCliente)
    public Cliente cadastroCliente(Cliente parametroCliente){
        return  clienteRepository.save(parametroCliente);

    }
}

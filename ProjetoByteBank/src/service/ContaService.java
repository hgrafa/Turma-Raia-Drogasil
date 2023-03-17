package service;

import model.Cliente;
import model.Conta;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class ContaService {

    private List<Conta> contas;
    private List<Cliente> clientes;

    public ContaService() {
        contas = new ArrayList<>();
        clientes = new ArrayList<>();
    }

    public boolean cadastraCliente(Cliente clienteParaCadastrar) {
        boolean cpfJaCadastrado = clientes
                .stream()
                .anyMatch(c -> c.getCpf().equals(clienteParaCadastrar.getCpf()));

        if(cpfJaCadastrado)
            return false; // TODO melhorar depois com excessões

        clientes.add(clienteParaCadastrar);
        return true;
    }

    public boolean cadastraConta(Conta contaParaCadastrar, String cpf) {
        var clienteOptional = clientes
                .stream()
                .filter(c -> c.getCpf().equals(cpf))
                .findFirst();

        if(clienteOptional.isEmpty())
            return false; // TODO melhorar depois com excessões

        contaParaCadastrar.setCliente(clienteOptional.get());
        contas.add(contaParaCadastrar);
        return true;
    }

}

package model;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

public class ControllerClientes {

    private static ControllerClientes instance = null;

    public ArrayList  <Cliente> listClientes;

    Scanner scan = new Scanner(System.in);

    private ControllerClientes() {
        listClientes = new ArrayList<>();
    }

    public static ControllerClientes getInstance() {

        if (instance == null) {
            instance = new ControllerClientes();
        }
        return instance;
    }

    public void addCliente() {
        System.out.println("*** Adicionar CLIENTE ****");

        System.out.println("Informe o nome do cliente a ser adicionado: ");
        String nome = scan.next();
        Cliente novoCliente = new Cliente(nome);
        listClientes.add(novoCliente);
    }
    public Cliente getNome(String nome) {
        Cliente resposta = null;

        for (Cliente cliente: listClientes
             ) {
            if (Objects.equals(cliente.nome, nome))
                resposta = cliente;
        }
        return resposta;
            }

    public void listAll() {
        System.out.println("*** Listar CLIENTE ****");
        {
                  System.out.println("Cliente : " + listClientes.toString());
              }
        }


}

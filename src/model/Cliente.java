package model;

import java.util.Scanner;

public class Cliente {

    String nome;

    public Cliente(String nome) {
        this.nome = nome;
    }

    public void cadastrarCliente(){
        System.out.println("Digite o nome do cliente: ");
        Scanner scan = new Scanner(System.in);
        Cliente novoCliente = new Cliente (scan.next());
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "nome='" + nome + '\'' +
                '}';
    }
}

package model;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ControllerContas {

    public static ControllerContas instance = null;
    Scanner scan = new Scanner(System.in);

    public ArrayList  <Conta> listContas;

    public ControllerContas() {
        listContas = new ArrayList<>();
    }

    public static ControllerContas getInstance() {
        System.out.println("*** Adicionar instância CONTA****");
        if (instance == null) {
            instance = new ControllerContas();
        }
        return instance;
    }

    public void addConta(Cliente cliente) {
        System.out.println("*** Adicionar CONTA ****");

        System.out.println("Informe opção : 1 Conta Corrente ou 2 Conta Poupança");
        int opcao = scan.nextInt();
        Conta novaConta = null;
        switch (opcao) {
            case 1 -> novaConta = new ContaCorrente(cliente);
            case 2 -> novaConta = new ContaPoupanca(cliente);
            default -> System.out.println("Opção inválida!");
        }
        listContas.add(novaConta);
    }

    public Conta getConta(int numroConta) {
        Conta resposta = null;
        for (Conta conta: listContas
             ) {
            if (conta.numeroConta == numroConta)
                resposta = conta;
        }
        return resposta;
            }
    public void listAll (){
        for (Conta conta: listContas) {
            System.out.println("Conta " + conta.numeroConta + "\n titular" + conta.titular);

        }
    }
}

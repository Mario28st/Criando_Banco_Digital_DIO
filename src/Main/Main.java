package Main;

import model.Cliente;
import model.ContaCorrente;
import model.ControllerClientes;
import model.ControllerContas;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int opcao = 0;
        Scanner scan = new Scanner(System.in);
        Scanner fim = new Scanner(System.in);
        do {
            ControllerClientes.getInstance().addCliente();
            System.out.println("Digitar o nome do cliente para abrir conta: ");
            ControllerContas.getInstance().addConta(ControllerClientes.getInstance().getNome(scan.next()));
            //System.out.println("Digitar o número da conta do cliente: ");
            //ControllerContas.instance.getConta(scan.nextInt()).depositar();
            System.out.println("tecle enter para continuar ou 9 para sair!");
            opcao = fim.nextInt();
        } while (opcao != 9);
        ControllerClientes.getInstance().listAll();
        ControllerContas.getInstance().listAll();
    }
    }

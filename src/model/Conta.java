package model;

import java.util.Scanner;

public abstract class Conta implements Operacoes{

    protected static int AGENCIA_PADRAO = 1;

    protected int agencia;
    protected int numeroConta;
    protected double saldo;
    protected Cliente titular;

    @Override
    public String toString() {
        return "Conta{" +
                "agencia=" + agencia +
                ", numeroConta=" + numeroConta +
                ", saldo=" + saldo +
                ", titular=" + titular +
                '}';
    }

    public Conta(Cliente cliente) {

        setAgencia(agencia);
        setNumeroConta(numeroConta);
        this.saldo = 0.00;
        this.titular = cliente;
    }

    public void sacar() {
        if (saldo <= 0) {
            System.out.println("Conta sem saldo para realizar essa operação!");
            return;
        }
        Scanner scan = new Scanner(System.in);
        System.out.println("Informe o valor a sacar: ");
        double retirada = scan.nextDouble();
        if (saldo < retirada) {
            System.out.println("Saldo insuficiente! Tente outro valor.");
            sacar();
        } else {
            setSaldo(saldo - retirada);
            System.out.println("Saque realizado com sucesso!");
            System.out.println("Seu novo saldo é " + getSaldo());
        }
    }

    public void depositar(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Informe o valor a depositar: ");
        double deposito = scan.nextDouble();
        setSaldo(saldo + deposito);
        System.out.println("Depósito realizado com sucesso!");
        System.out.println("Seu novo saldo é " + getSaldo());
    }

    public void transferir(){
        this.sacar();
        Scanner destino = new Scanner(System.in);
        System.out.println("Informe os dados para crédito.");
        int agenciaDestino = AGENCIA_PADRAO;

        System.out.println("Informe a conta: ");
        int contaDestino = destino.nextInt();




        if (saldo <= 0) {
            System.out.println("Conta sem saldo para realizar essa operação!");
            return;
        }
        Scanner scan = new Scanner(System.in);
        double retirada;
        System.out.println("Informe o valor a transferir: ");
        retirada = scan.nextDouble();
        if (saldo < retirada) {
            System.out.println("Saldo insuficiente! Tente outro valor.");
            transferir();
        } else {
            setSaldo(saldo - retirada);


            System.out.println("Transferência realizado com sucesso!");
            System.out.println("Seu novo saldo é " + getSaldo());
        }

    }

    public void imprimirSaldo(){

    }

    public int getAgencia() {
        return agencia;
    }

    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}

package model;

public class ContaPoupanca extends Conta {

    private static int SEQUENCIAL = 9001;
    public ContaPoupanca(Cliente cliente) {
            super(cliente);
            super.agencia = AGENCIA_PADRAO;
            super.numeroConta = SEQUENCIAL++;
    }
    @Override
    public void imprimirSaldo(){

    }

}

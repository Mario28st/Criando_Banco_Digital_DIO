package model;

public class ContaCorrente extends Conta {

    private static int SEQUENCIAL = 1;
    public ContaCorrente(Cliente cliente) {
        super(cliente);
        super.agencia = AGENCIA_PADRAO;
        super.numeroConta = SEQUENCIAL++;

    }
    @Override
    public void imprimirSaldo(){

    }
}

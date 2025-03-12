public abstract class Conta implements IConta {
    
    private static final int AGENCIA_PADRAO = 1;
    private static int SEQUENCIAL = 1;


    protected int agencia;
    protected int numero;
    protected double saldo;

   
    public ContaCorrente() {
       this.agencia = Conta.AGENCIA_PADRAO;
       this.numero = SEQUENCIAL++;

    }

    @Override
    public void sacar(double valor) {
        this.saldo -= valor;
    }

    @Override
    public void depositar (double valor) {
        this.saldo += valor;
    }

    @Override
    public void transferir (double valor, Conta contadetino) {
        this.sacar(valor);
        contadetino.depositar(valor);

    }


    public int getAgencia() {
        return agencia;
    }

    public int getNumero() {
        return numero;
    }

    public int getSaldo() {
        return saldo;
    }

}

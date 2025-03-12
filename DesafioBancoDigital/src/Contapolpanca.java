public class Contapolpanca extends Conta{

    @Override
    public void imprimirExtrato() {
       System.out.println(".*.* Extrato Conta Polpança *.*."); 
       System.out.println(String.format("Agencia: %d", super.agencia));
       System.out.println(String.format("Numero: %d", super.numero));
       System.out.println(String.format("Saldo: %..2f", super.saldo));

    }


}

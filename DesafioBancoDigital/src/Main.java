public class Main {

    public static void main(String[] args) {
        Conta cc = new ContaCorrente();
        cc.depositar(100);
         Conta polpanca = new Contapolpanca();
        

        cc.imprimirExtrato();
        polpanca.imprimirExtrato();


    }

}

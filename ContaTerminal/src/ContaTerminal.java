import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
       
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        
        System.out.println("Por favor digite o número da conta:");
        int numero = scanner.nextInt();

        System.out.println("Por favor informe a agência:");
        String agencia = scanner.next();
        
        System.out.println("Por favor informe seu nome:");
        String nome = scanner.next();

        System.out.println("Por favor informe seu saldo:");
        double Saldo = scanner.nextDouble();

        
        System.out.println("Ola " + nome + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + " e seu saldo " + Saldo + " já está disponível para saque.");
        
        scanner.close();
    }
}
//TODO:Conhecer e importar a classe Scanner
import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        //criar o objeto scanner
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        //Exibir as mensagens para o nosso usuário e obter pelo scanner os valores digitados no terminal
        System.out.println("Digite o número da Agência");
        String Agencia = scanner.next();
        
        System.out.println("Digite o número da conta");
        int numero = scanner.nextInt();

        System.out.println("Digite seu saldo");
        double saldo = scanner.nextDouble();

        System.out.println("Digite seu nome");
        String nome = scanner.next();

        System.out.println("Digite seu sobrenome");
        String sobrenome = scanner.next();
        
        //Exibir a mensagem conta criada
        System.out.println("Olá " + nome + " " + sobrenome + ", obrigado por criar uma conta em nosso banco, sua agência é " + Agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque.");
    }
}

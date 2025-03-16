import java.util.Scanner;

public class SistemaBancario {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite seu nome: ");
        String nome = scanner.nextLine();
        
        System.out.println("Digite quanto gostaria de depositar: ");
        float valor = scanner.nextInt();

        System.out.println("Nome: " + nome + " Seu saldo é: " + valor);
    }
}

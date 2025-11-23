import java.util.Scanner;

public class EntradaSaidaDeDados {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Olá digite o seu nome: ");
        String nome = scanner.nextLine();
        System.out.println("Nome: " + nome);

        System.out.println("Digite sua idade: ");
        int idade = scanner.nextInt();
        System.out.println("Idade: " + idade + " anos");

        System.out.println("Digite se você está empregado SIM(true) ou Não(false)");
        boolean empregado = scanner.nextBoolean();
        System.out.println("Olá sou: " + nome);
        System.out.println("Tenho: " + idade + " anos");
        System.out.println("Estou empregado? (true or false): " + empregado);
    }
}

import java.text.DecimalFormat;

//exercício:
//criar variavis, atribuir valor a elas e depois imprimir na tela
//print do salario com duas casas depois da vírgula

public class Main {
    public static void main(String[] args) {

        //CODIGO REFATORADO

        //variaveis
        String nome = "Aline";
        int idade = 34;
        double salarioMensal = 8500.00;
        char genero = 'F';
        boolean funcionarioJava = true;

        //print do salario com duas casas depois da vírgula
        DecimalFormat df = new DecimalFormat("##.00"); //'0' força a exibição de zeros se não houver dígito
        String numeroFormatado = df.format(salarioMensal);

        //print na tela
        System.out.println("A colaboradora: " + nome + " com idade de: " + idade + " anos " + "do Gênero: " + genero);
        System.out.println("Ela é uma colaboradora DEV Java: " + funcionarioJava);
        System.out.println("Recebe um sálario de: R$" + salarioMensal + "\n");
        System.out.println("Obs: Sálario com duas casas depois da vírgula");
        System.out.println("Recebe um sálario de: R$" + numeroFormatado);

        //CODIGO DA AULA

        /*int idade = 35;
        long quantidadedeCachorros = 10L; //tipo primitivo long precisa ter o (L) no final
        double salarioMensal = 4500.00;
        char genero = 'M';
        boolean empregadoJava = true;

        System.out.println("Idade: " + idade);
        System.out.println("Salário: " + salarioMensal);
        System.out.println("Gênero: " + genero);
        System.out.println("Empregado: " + empregadoJava);*/

        //CODIGO DO EXERCICIO

        /*String nome = "Aline";
        int idade = 34;
        double salarioMensal = 8500.00;
        char genero = 'F';
        boolean funcionarioJava = true;

        System.out.println("A colaboradora: " + nome + " com idade de: " + idade + " anos " + "do Gênero: " + genero);
        System.out.println("Ela é uma colaboradora DEV Java: " + funcionarioJava);

        //print do salario modo padrão
        System.out.println("Recebe um sálario de: R$" + salarioMensal + "\n");

        //print do salario com duas casas depois da vírgula
        DecimalFormat df = new DecimalFormat("##.00"); //'0' força a exibição de zeros se não houver dígito

        String numeroFormatado = df.format(salarioMensal);
        System.out.println("Obs: Sálario com duas casas depois da vírgula");
        System.out.println("Recebe um sálario de: R$" + numeroFormatado);*/
    }
}
public class OperadoresAritmeticos {

    public static void main(String[] args) {
        double pao = 9.50;
        double queijo = 7.00;
        double acucar = 1.00;
        double desconto = 5.00;
        int totalDiasDoMes = 30;

        double valorTotal = pao + queijo + acucar;
        double valorTotalComDesconto = valorTotal - desconto;
        double valorTotalDividido = valorTotal / 2;
        double valorTotalMensal = valorTotalComDesconto * totalDiasDoMes;

        System.out.println("Valor Total = R$" + valorTotal);
        System.out.println("Valor Total com desconto = R$" + valorTotalComDesconto);
        System.out.println("Valor Total dividido por 2 = R$" + valorTotalDividido);
        System.out.println("Valor Total mensal = R$" + valorTotalMensal);
    }
}

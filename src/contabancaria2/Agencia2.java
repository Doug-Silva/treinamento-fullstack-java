package contabancaria2;

public class Agencia2 {
    public static void main(String[] args) {
        ContaBancaria2 contaCliente = new ContaBancaria2("Douglas", 200);

        System.out.println("O cliente é: " + contaCliente.getTitular());
        System.out.println("O saldo atual do cliente é: " + contaCliente.getSaldo());

        contaCliente.setTitular("Aline");
        contaCliente.setSaldo(contaCliente.getSaldo() + 300);

        String novoTitular = contaCliente.getTitular();
        double novoSaldo = contaCliente.getSaldo();

        System.out.println("O novo titular da conta é: " + novoTitular);
        System.out.println("O saldo atual atualizado é: " + novoSaldo);
    }
}

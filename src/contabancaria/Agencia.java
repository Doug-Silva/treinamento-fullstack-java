package contabancaria;

public class Agencia {
    public static void main(String[] args) {
        ContaBancaria minhaConta = new ContaBancaria("Angelica", 500);

        //Dados iniciais da conta
        System.out.println("O titular da conta é: " + minhaConta.getTitular());
        System.out.println("O saldo da conta é: " + minhaConta.getSaldo());

        //Modifiquei o titular e adicionei mais 500 na conta
        minhaConta.setTitular("Angelica Weiler");
        minhaConta.setSaldo(minhaConta.getSaldo() + 500);

        String titularConta = minhaConta.getTitular();
        double saldoFinal = minhaConta.getSaldo();

        System.out.println("O titular da conta é: " + titularConta);
        System.out.println("E o saldo final é: " + saldoFinal);
    }
}

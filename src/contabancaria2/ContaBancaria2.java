package contabancaria2;

public class ContaBancaria2 {

    private String titular;
    private int saldo;

    public ContaBancaria2(String titular, int saldo) {
        this.titular = titular;
        this.saldo = saldo;
    }

    public ContaBancaria2() {
    }

    public ContaBancaria2(String titular) {
        this.titular = titular;
        this.saldo = 0;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }
}

import lombok.Getter;

public abstract class Conta {

    @Getter
    private int agencia = 1;
    @Getter
    private static int numero = 0;
    @Getter
    private double saldo = 0;
    @Getter
    private Titular titular;

    public Conta(Titular titular) {
        this.numero++;
        this.titular = titular;
    }

    public void sacar(double montante) {
        if(this.saldo >= montante){
            this.saldo -= montante;
        } else {
            System.out.println("Saldo insuficiente.");
        }
    }

    public void depositar(double montante){
        this.saldo += montante;
    }

    public void transferir(Conta contaDestino, double montante){
        this.sacar(montante);
        contaDestino.depositar(montante);
    }

    protected void imprimirDetalhes(){
        System.out.println("Agencia: " + this.agencia);
        System.out.println("Conta: " + this.numero);
        System.out.println("Saldo: " + this.saldo);
    }

}

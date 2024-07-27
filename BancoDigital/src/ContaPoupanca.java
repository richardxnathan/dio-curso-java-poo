public class ContaPoupanca extends Conta {

    public ContaPoupanca(Titular titular) {
        super(titular);
    }

    public void imprimirExtrato(){
        System.out.println("EXTRATO CONTA POUPANÇA");
        System.out.println("Titulat: " + this.getTitular().getNome());
        super.imprimirDetalhes();
    }


}

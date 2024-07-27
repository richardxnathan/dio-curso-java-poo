public class ContaCorrente extends Conta {

    public ContaCorrente(Titular titular) {
        super(titular);
    }

    public void imprimirExtrato(){
        System.out.println("EXTRATO CONTA CORRENTE");
        System.out.println("Titulat: " + this.getTitular().getNome());
        super.imprimirDetalhes();
    }

}

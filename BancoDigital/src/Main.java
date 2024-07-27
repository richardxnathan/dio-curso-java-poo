public class Main {

    public static void main(String[] args) {

        Titular richard = new Titular("Richard");
        Titular leonardo = new Titular("Leonardo");
        ContaCorrente cc = new ContaCorrente(richard);
        ContaPoupanca cp = new ContaPoupanca(leonardo);

        cc.depositar(100);
        cc.transferir(cp, 100);

        cc.imprimirExtrato();
        cp.imprimirExtrato();

    }

}

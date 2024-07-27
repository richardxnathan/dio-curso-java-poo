import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

public class Banco {

    @Getter
    private String nome;
    @Getter
    private List<Conta> contas;

    public Banco(String nome) {
        this.nome = nome;
        this.contas = new ArrayList<>();
    }

    public void mostrarClientes(){
        for (Conta c : contas) {
            c.getTitular().getNome();
        }
    }

}

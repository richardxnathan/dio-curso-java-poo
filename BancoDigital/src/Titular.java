import lombok.Getter;

public class Titular {

    @Getter
    private String nome;

    public Titular(String nome) {
        this.nome = nome;
    }

}

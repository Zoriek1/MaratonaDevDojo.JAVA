package ZoriekCaio.maratonajava.javacore.Jmodificadorfinal.dominio;

public class Comprador {
    String nome;

    @Override
    public String toString() {
        return "Comprador{" +
                "nome='" + nome + '\'' +
                '}';
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}

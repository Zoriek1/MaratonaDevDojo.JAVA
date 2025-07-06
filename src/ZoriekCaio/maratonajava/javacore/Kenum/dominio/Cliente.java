package ZoriekCaio.maratonajava.javacore.Kenum.dominio;

public class Cliente {
    private String nome;
    private TipoCliente TipoCliente;

    public String getNome() {
        return nome;
    }

    public Cliente(String nome, ZoriekCaio.maratonajava.javacore.Kenum.dominio.TipoCliente tipoCliente) {
        this.nome = nome;
        TipoCliente = tipoCliente;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "nome='" + nome + '\'' +
                ", TipoCliente=" + TipoCliente +
                '}';
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public TipoCliente getTipoCliente() {
        return TipoCliente;
    }

    public void setTipoCliente(TipoCliente tipoCliente) {
        TipoCliente = tipoCliente;
    }
}

package MaratonaJava.javacore.Kenum.dominio;

public class Cliente {
    private String nome;
    private TipoCliente TipoCliente;
    TipoPagamento TipoPagamento;

    @Override
    public String toString() {
        return "Cliente{" +
                "nome='" + nome + '\'' +
                ", TipoCliente=" + TipoCliente +
                ", TipoClienteInt=" + TipoCliente.getValor() +
                ", tipoPagamento=" + TipoPagamento +
                '}';
    }

    public String getNome() {
        return nome;
    }

    public Cliente(String nome, TipoCliente tipoCliente, TipoPagamento tipoPagamento) {
        this.nome = nome;
        TipoCliente = tipoCliente;
        this.TipoPagamento = tipoPagamento;
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

    public TipoPagamento getTipoPagamento() {
        return TipoPagamento;
    }

    public void setTipoPagamento(TipoPagamento tipoPagamento) {
        this.TipoPagamento = tipoPagamento;
    }
}

package ZoriekCaio.maratonajava.javacore.Kenum.dominio;

public enum TipoCliente {
    PESSOA_FISICA(1),
    PESSOA_JURIDICA(2);

    private final int valor;

    public int getValor() {
        return valor;
    }

    TipoCliente(int valor) {
        this.valor = valor;
    }
}


package ZoriekCaio.maratonajava.javacore.Npolimorfismo.dominio;

public class Tomate extends Produto{
    public static final double IMPOSTO_POR_CENTO = 0.06;
    public Tomate(String nome, double valor) {
        super(nome, valor);
    }
    protected String dataDeValidade;

    public void setDataDeValidade(String dataDeValidade) {
        this.dataDeValidade = dataDeValidade;
    }

    public String getDataDeValidade() {
        return dataDeValidade;
    }

    @Override
    public double CalcularImposto() {
        System.out.println("Calculando imposto do Tomate...");
        return valor*IMPOSTO_POR_CENTO;
    }
}

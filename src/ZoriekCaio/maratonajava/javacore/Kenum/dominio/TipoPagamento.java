package ZoriekCaio.maratonajava.javacore.Kenum.dominio;

public enum TipoPagamento {
    PIX{
        @Override
        public double CalcularDesconto(double valor) {
            return valor*0.15;
        }
    }, CRÉDITO{
    @Override
    public double CalcularDesconto(double valor) {
        return valor*0.05;
    }}, DÉBITO{
        @Override
        public double CalcularDesconto(double valor) {
            return valor*0.10;
        }
    };


    ;



    public abstract double CalcularDesconto(double valor);

}

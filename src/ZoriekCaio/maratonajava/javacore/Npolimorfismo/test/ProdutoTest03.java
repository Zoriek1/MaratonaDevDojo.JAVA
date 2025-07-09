package ZoriekCaio.maratonajava.javacore.Npolimorfismo.test;

import ZoriekCaio.maratonajava.javacore.Npolimorfismo.dominio.Computador;
import ZoriekCaio.maratonajava.javacore.Npolimorfismo.dominio.Produto;
import ZoriekCaio.maratonajava.javacore.Npolimorfismo.dominio.Tomate;
import ZoriekCaio.maratonajava.javacore.Npolimorfismo.servico.CalculadoraImposto;

public class ProdutoTest03 {
    public static void main(String[] args) {
        Produto produto1 = new Computador("Intel i5 9° Geração", 2500);
        Tomate tomate = new Tomate("Tomate palito", 20);
        tomate.setDataDeValidade("10/09/2025");
        CalculadoraImposto.calcularImposto(produto1);
        System.out.println("---------------------");
        CalculadoraImposto.calcularImposto(tomate);
    }
}

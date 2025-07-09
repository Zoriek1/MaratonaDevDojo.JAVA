package ZoriekCaio.maratonajava.javacore.Npolimorfismo.test;

import ZoriekCaio.maratonajava.javacore.Npolimorfismo.dominio.Computador;
import ZoriekCaio.maratonajava.javacore.Npolimorfismo.dominio.Produto;
import ZoriekCaio.maratonajava.javacore.Npolimorfismo.dominio.Televisao;
import ZoriekCaio.maratonajava.javacore.Npolimorfismo.dominio.Tomate;
import ZoriekCaio.maratonajava.javacore.Npolimorfismo.servico.CalculadoraImposto;

public class ProdutoTest01 {
    public static void main(String[] args) {
        Produto computador = new Computador("Computador Xean 2.4GHz i5 4° Gen", 2500);
        Produto tomate = new Tomate("Tomate Fino", 1.5);
        Produto tv = new Televisao("Sansumg 40\"", 1500);
        CalculadoraImposto.calcularImposto(computador);
        System.out.println("------------------------------------");
        CalculadoraImposto.calcularImposto(tomate);
        System.out.println("------------------------------------");
        CalculadoraImposto.calcularImposto(tv);
    }
}

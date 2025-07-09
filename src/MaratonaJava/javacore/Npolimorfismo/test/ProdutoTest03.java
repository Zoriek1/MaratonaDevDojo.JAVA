package MaratonaJava.javacore.Npolimorfismo.test;

import MaratonaJava.javacore.Npolimorfismo.dominio.Computador;
import MaratonaJava.javacore.Npolimorfismo.dominio.Produto;
import MaratonaJava.javacore.Npolimorfismo.dominio.Tomate;
import MaratonaJava.javacore.Npolimorfismo.servico.CalculadoraImposto;

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

package ZoriekCaio.maratonajava.javacore.Npolimorfismo.test;

import ZoriekCaio.maratonajava.javacore.Npolimorfismo.dominio.Computador;
import ZoriekCaio.maratonajava.javacore.Npolimorfismo.dominio.Produto;

public class ProdutoTest02 {
    public static void main(String[] args) {
        Produto produto = new Computador("Ryzen 9", 2000);
        System.out.println(produto.getNome());
        System.out.println(produto.getValor());
    }
}

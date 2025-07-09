package MaratonaJava.javacore.Npolimorfismo.servico;

import MaratonaJava.javacore.Npolimorfismo.dominio.Produto;
import MaratonaJava.javacore.Npolimorfismo.dominio.Tomate;

public class CalculadoraImposto {
    public static void calcularImposto(Produto produto){
        System.out.println("Relátorio de imposto");
        double imposto = produto.CalcularImposto();
        System.out.println("Produto: "+ produto.getNome());
        System.out.println("valor: "+ produto.getValor());
        System.out.println("Imposto a ser pago: "+ imposto);
        if (produto instanceof Tomate){
        System.out.println("Data de Validade: "+ ((Tomate) produto).getDataDeValidade());
    }}
}

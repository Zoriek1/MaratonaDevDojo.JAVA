package ZoriekCaio.maratonajava.javacore.Kenum.test;

import ZoriekCaio.maratonajava.javacore.Kenum.dominio.Cliente;
import ZoriekCaio.maratonajava.javacore.Kenum.dominio.TipoCliente;
import ZoriekCaio.maratonajava.javacore.Kenum.dominio.TipoPagamento;

public class ClienteTest01 {
    public static void main(String[] args) {

       Cliente cliente = new Cliente("Caio", TipoCliente.PESSOA_FISICA, TipoPagamento.CRÉDITO);
       Cliente cliente2 = new Cliente("João", TipoCliente.PESSOA_JURIDICA, TipoPagamento.DÉBITO);
       Cliente cliente3 = new Cliente("João", TipoCliente.PESSOA_FISICA,TipoPagamento.CRÉDITO);
       Cliente cliente4 = new Cliente("João", TipoCliente.PESSOA_FISICA, TipoPagamento.PIX);

        System.out.println(cliente);
        System.out.println(cliente2);
        System.out.println(cliente3);
        System.out.println(cliente4);
        System.out.println(cliente2.getTipoPagamento().CalcularDesconto(1500));

    }
}

package MaratonaJava.javacore.Jmodificadorfinal.test;

import MaratonaJava.javacore.Jmodificadorfinal.dominio.Carro;

public class CarroTest01 {
    public static void main(String[] args) {
        Carro carro = new Carro();
        System.out.println(Carro.VELOCIDADE_LIMITE);
        System.out.println(carro.COMPRADOR);
        carro.COMPRADOR.setNome("Marum");
        System.out.println(carro.COMPRADOR);
    }
}

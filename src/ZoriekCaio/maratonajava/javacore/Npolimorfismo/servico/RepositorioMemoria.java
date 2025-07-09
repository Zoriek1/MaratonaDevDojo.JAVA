package ZoriekCaio.maratonajava.javacore.Npolimorfismo.servico;

import ZoriekCaio.maratonajava.javacore.Npolimorfismo.repositorio.Repositorio;

public class RepositorioMemoria implements Repositorio {
    @Override
    public void salvar() {
        System.out.println("Salvando em Memoria...");
    }
}

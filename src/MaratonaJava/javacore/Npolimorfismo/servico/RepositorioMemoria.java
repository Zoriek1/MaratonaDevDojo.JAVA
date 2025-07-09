package MaratonaJava.javacore.Npolimorfismo.servico;

import MaratonaJava.javacore.Npolimorfismo.repositorio.Repositorio;

public class RepositorioMemoria implements Repositorio {
    @Override
    public void salvar() {
        System.out.println("Salvando em Memoria...");
    }
}

package MaratonaJava.javacore.Npolimorfismo.test;

import MaratonaJava.javacore.Npolimorfismo.repositorio.Repositorio;
import MaratonaJava.javacore.Npolimorfismo.servico.RepositorioArquivo;
import MaratonaJava.javacore.Npolimorfismo.servico.RepositorioBancoDeDados;
import MaratonaJava.javacore.Npolimorfismo.servico.RepositorioMemoria;

public class RepositorioTest01 {
    public static void main(String[] args) {
        Repositorio repDB = new RepositorioBancoDeDados();
        Repositorio repArq = new RepositorioArquivo();
        Repositorio repMEM = new RepositorioMemoria();

        repDB.salvar();
        repArq.salvar();
        repMEM.salvar();
    }
}

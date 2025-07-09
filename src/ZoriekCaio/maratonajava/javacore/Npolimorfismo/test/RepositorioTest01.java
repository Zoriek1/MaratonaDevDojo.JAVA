package ZoriekCaio.maratonajava.javacore.Npolimorfismo.test;

import ZoriekCaio.maratonajava.javacore.Npolimorfismo.repositorio.Repositorio;
import ZoriekCaio.maratonajava.javacore.Npolimorfismo.servico.RepositorioArquivo;
import ZoriekCaio.maratonajava.javacore.Npolimorfismo.servico.RepositorioBancoDeDados;
import ZoriekCaio.maratonajava.javacore.Npolimorfismo.servico.RepositorioMemoria;

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

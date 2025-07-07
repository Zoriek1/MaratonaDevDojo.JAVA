package ZoriekCaio.maratonajava.javacore.Mintefaces.dominio;

public class DatabaseLoader implements DataLoader, DataRemover {
    @Override
    public void remove() {
        System.out.println("Removendo Elementos...");
    }

    @Override
    public void load() {
        System.out.println("Carregando arquivos do banco de dados...");
    }
}

package MaratonaJava.javacore.Mintefaces.dominio;

public class FileLoader implements DataLoader{
    @Override
    public void load() {
        System.out.println("Carregndo arquivos do banco de dados...");
    }
}

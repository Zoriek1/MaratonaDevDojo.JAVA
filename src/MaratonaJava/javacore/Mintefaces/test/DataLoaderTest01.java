package MaratonaJava.javacore.Mintefaces.test;

import MaratonaJava.javacore.Mintefaces.dominio.DatabaseLoader;
import MaratonaJava.javacore.Mintefaces.dominio.FileLoader;

public class DataLoaderTest01 {
    public static void main(String[] args) {
        DatabaseLoader Dataloader = new DatabaseLoader();
        FileLoader Fileloader = new FileLoader();
        Dataloader.load();
        Dataloader.remove();
        Fileloader.load();
    }
}

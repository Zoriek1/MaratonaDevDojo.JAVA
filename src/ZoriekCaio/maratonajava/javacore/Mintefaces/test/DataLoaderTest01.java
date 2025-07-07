package ZoriekCaio.maratonajava.javacore.Mintefaces.test;

import ZoriekCaio.maratonajava.javacore.Mintefaces.dominio.DatabaseLoader;
import ZoriekCaio.maratonajava.javacore.Mintefaces.dominio.FileLoader;

public class DataLoaderTest01 {
    public static void main(String[] args) {
        DatabaseLoader Dataloader = new DatabaseLoader();
        FileLoader Fileloader = new FileLoader();
        Dataloader.load();
        Dataloader.remove();
        Fileloader.load();
    }
}

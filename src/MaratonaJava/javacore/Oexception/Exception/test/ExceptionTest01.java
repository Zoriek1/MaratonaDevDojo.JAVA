package MaratonaJava.javacore.Oexception.Exception.test;

import java.io.File;
import java.io.IOException;

public class ExceptionTest01 {
    public static void main(String[] args) {
        criarNovoArquivo();
    }
    public static void criarNovoArquivo(){
        File file = new File("arquivo\\test.txt");

        try{
            boolean Iscreated = file.createNewFile();
            System.out.println("Arquivo criado "+Iscreated);
        }
        catch (IOException e){
            e.printStackTrace();
            throw new RuntimeException("O arquivo Selecionado não existe ou não pode ser acessado.");
        }


    }
}

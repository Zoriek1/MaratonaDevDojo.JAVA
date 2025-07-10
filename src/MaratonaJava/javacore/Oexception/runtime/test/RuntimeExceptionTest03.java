package MaratonaJava.javacore.Oexception.runtime.test;

import java.io.IOException;

public class RuntimeExceptionTest03 {
    public static void main(String[] args) {

    }
    public static String abreConexao(){
        try{
            System.out.println("Abrindo arquvio...");
            System.out.println("Abrindo Escrevendo dados no arquivo...");
            return "conexão aberta";
        }catch (Exception e){
            e.printStackTrace();
        }finally{
            System.out.println("Fechando arquivo, liberndo para o SO");
        }
        return null ;
    }
}

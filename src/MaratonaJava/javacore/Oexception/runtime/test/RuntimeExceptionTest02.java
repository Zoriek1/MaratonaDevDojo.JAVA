package MaratonaJava.javacore.Oexception.runtime.test;

import java.io.IOException;

public class RuntimeExceptionTest02 {
    public static void main(String[] args) {
        try{
            System.out.println(divisao(2,0));
        }
        catch (RuntimeException e){
            e.printStackTrace();
        }
        System.out.println("Código Finalizado");
    }

    /**
     * @param a
     * @param b
     * @return a/b
     * @throws IllegalArgumentException caso b seja 0
     */

    public static double divisao(double a,double b){
        if (b==0) {
            throw new IllegalArgumentException("Argumento ilegal, não pode dividir por 0");
        }
            return  a/b;
    }
}

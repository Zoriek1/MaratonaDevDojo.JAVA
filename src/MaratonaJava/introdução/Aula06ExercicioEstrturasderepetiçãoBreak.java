package MaratonaJava.introdução;

import java.util.Scanner;

public class Aula06ExercicioEstrturasderepetiçãoBreak {
    public static void main(String[] args) {
        
        
        
        
        double  ValorCarro = 15000;
         
        for(int parcela = 1 ;parcela <= ValorCarro;parcela++) {
            double ValorParcela = ValorCarro/parcela;



            System.out.println("O valor parcelando em: "+ parcela + " Será R$ " + ValorParcela);

            if (ValorParcela <= 1000){

                break;
            }
            
        }
        
        
        
    }
}

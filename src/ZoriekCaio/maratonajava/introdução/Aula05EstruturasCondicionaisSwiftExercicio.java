package ZoriekCaio.maratonajava.introdução;
import java.util.Scanner;

public class Aula05EstruturasCondicionaisSwiftExercicio {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        byte dia;

        System.out.println("Digite sua dia: ");
        dia = sc.nextByte();


        switch (dia){

            case 2,3,4,5,6:
                System.out.println("è dia Util, Vá trabalhar!");
                break;

            case 1,7:
                System.out.println("è Final de semana!, bora pra praia");
                break;
            default:

                System.out.println("Digite sua dia: ");
                return;


        }


    }
}

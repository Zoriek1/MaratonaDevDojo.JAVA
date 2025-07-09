package MaratonaJava.introdução;

public class Aula05Estruturascondicionais5
{
    public static void main(String[] args) {

        double Salario;
        double Resultado;

        Salario = -10;

        double SmallImpost = 9.7/100;
        double MediumImpost = 37.5/100;
        double LargeImpost = 49.5/100;

        if (Salario <= 37456 && Salario > 0){

            Resultado = Salario*SmallImpost;

        } else if (Salario > 37456 && Salario <= 68436){

            Resultado =  Salario*MediumImpost;

        } else {

            Resultado =  Salario*LargeImpost;

        }

        System.out.println(Resultado);





    }
}

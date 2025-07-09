package MaratonaJava.javacore.LclassesAbstratas.dominio;

public class Desenvolvedor extends Funcionario {
    public Desenvolvedor(String nome, double salario) {
        super(nome, salario);
    }

    @Override
    public void imprime() {
        System.out.println("Imprimindo...");
    }
}

package MaratonaJava.javacore.Oexception.error.test;

public class StackOverFlowTest01 {
    public static void main(String[] args) {
Recursividade();
    }

    public static void Recursividade(){
        Recursividade();
    }
}

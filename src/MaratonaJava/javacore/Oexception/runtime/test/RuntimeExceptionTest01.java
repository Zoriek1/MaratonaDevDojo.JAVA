package MaratonaJava.javacore.Oexception.runtime.test;

public class RuntimeExceptionTest01 {
    public static void main(String[] args) {
        // Checked e Unchecked
        Object object = null;
        System.out.println(object.toString());

        double array[] = {1,2};
        System.out.println(array[3]);
    }
}

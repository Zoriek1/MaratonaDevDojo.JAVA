package ZoriekCaio.maratonajava.javacore.Hheranca.teste;

import ZoriekCaio.maratonajava.javacore.Hheranca.dominio.Endereco;
import ZoriekCaio.maratonajava.javacore.Hheranca.dominio.Funcionario;
import ZoriekCaio.maratonajava.javacore.Hheranca.dominio.Pessoa;

public class HerancaTest01 {
    public static void main(String[] args) {
        Endereco endereco = new Endereco();
        endereco.setCep("74914-230");
        endereco.setRua("Rua das flores,123");
        Pessoa pessoa = new Pessoa();
        pessoa.setCpf("123.321.312.28");
        pessoa.setNome("Caio");
        pessoa.setEndereco(endereco);
        pessoa.imprime();

        Funcionario funcionario = new Funcionario();
        funcionario.setNome("Jõao pedro");
        funcionario.setCpf("777.666.222-21");
        funcionario.setEndereco(endereco);
        funcionario.setSalario(2700.00);
        funcionario.imprime();


    }
}

package implementaçãocompleta;

import java.util.ArrayList;
import java.util.List;


public class ImplementaçãoCompleta {
    public static void main(String[] args) {
        Empresa empresa = new Empresa();

        Funcionario funcionario1 = new Funcionario("Joao", 2000.0);
        Gerente gerente1 = new Gerente("Maria", 5000.0, "RH");

        empresa.adicionarFuncionario(funcionario1);
        empresa.adicionarFuncionario(gerente1);

        List<Funcionario> funcionarios = empresa.listarFuncionarios();

        for (Funcionario f : funcionarios) {
            System.out.println("Nome: " + f.getNome());
            System.out.println("Salario: " + f.getSalario());

            if (f instanceof Gerente) {
                Gerente gerente = (Gerente) f;
                System.out.println("Departamento: " + gerente.getDepartamento());
            }

            System.out.println("-----------------------");
        }
    }
}


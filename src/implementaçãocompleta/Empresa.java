package implementaçãocompleta;

import java.util.ArrayList;
import java.util.List;


class Empresa {
    private List<Funcionario> funcionarios;

    public Empresa() {
        this.funcionarios = new ArrayList<>();
    }

    public void adicionarFuncionario(Funcionario f) {
        funcionarios.add(f);
    }

    public List<Funcionario> listarFuncionarios() {
        return funcionarios;
    }
}

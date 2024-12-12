package HerancaPolimorfismo.Construtora;

import java.util.ArrayList;
import java.util.List;

public class Construtora {
    private List<Funcionario> funcionarios = new ArrayList<Funcionario>();


    public Construtora(){}

    public Construtora(List<Funcionario> funcionarios){
        this.funcionarios = funcionarios;
    }



    public void addFuncionario(Funcionario funcionario){
        funcionarios.add(funcionario);
    }



    public List<Funcionario> getFuncionarios() {
        return funcionarios;
    }

    public List<Engenheiro> getEngenheiros(){
        List<Engenheiro> engenheiros = new ArrayList<Engenheiro>();
        for(int i = 0; i < funcionarios.size(); i++){
            if(funcionarios.get(i) instanceof Engenheiro){
                engenheiros.add((Engenheiro) funcionarios.get(i));
            }
        }
        return engenheiros;
    }

    public List<Motorista> getMotoristas(){
        List<Motorista> motoristas = new ArrayList<Motorista>();
        for(int i = 0; i < funcionarios.size(); i++){
            if(funcionarios.get(i) instanceof Motorista){
                motoristas.add((Motorista) funcionarios.get(i));
            }
        }
        return motoristas;
    }
}

package HerancaPolimorfismo.Construtora;

import java.util.ArrayList;
import java.util.List;

public class Construtora {
    private List<Funcionario> funcionarios = new ArrayList<Funcionario>();
    private List<Engenheiro> engenheiros = new ArrayList<Engenheiro>();
    private List<Motorista> motoristas = new ArrayList<Motorista>();


    public Construtora(){}

    public Construtora(List<Funcionario> funcionarios, List<Engenheiro> engenheiros, List<Motorista> motoristas){
        this.funcionarios = funcionarios;
        this.engenheiros = engenheiros;
        this.motoristas = motoristas;
    }



    public void addFuncionario(Funcionario funcionario){
        funcionarios.add(funcionario);
    }

    public void addFuncionario(Engenheiro engenheiro){
        engenheiros.add(engenheiro);
    }

    public void addFuncionario(Motorista motorista){
        motoristas.add(motorista);
    }



    public List<Funcionario> getFuncionarios() {
        return funcionarios;
    }

    public List<Engenheiro> getEngenheiros(){
        return engenheiros;
    }

    public List<Motorista> getMotoristas(){
        return motoristas;
    }
}

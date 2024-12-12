package HerancaPolimorfismo.Construtora.Test;

import HerancaPolimorfismo.Construtora.Construtora;
import HerancaPolimorfismo.Construtora.Engenheiro;
import HerancaPolimorfismo.Construtora.Funcionario;
import HerancaPolimorfismo.Construtora.Motorista;

public class ConstrutoraTest {
    public static void main(String[] args) {
        Construtora constutora = new Construtora();

        for(int i = 0; i < 5; i++){
            Funcionario funcionario = new Funcionario(("func " + i), ("emailFunc" + i + "@email.com"), ("foneFunc" + i));
            Engenheiro engenheiro = new Engenheiro(("eng " + i), ("emailEng" + i + "@email.com"), ("foneEng" + i), ("creaEng" + i));
            Motorista motorista = new Motorista(("moto " + i), ("emailMoto" + i + "@email.com"), ("foneMoto" + i), ("cnhMoto" + i));

            constutora.addFuncionario(funcionario);
            constutora.addFuncionario(engenheiro);
            constutora.addFuncionario(motorista);
        }

        System.out.println("Funcionarios: " + constutora.getFuncionarios() + "\nEngenheiros: " + constutora.getEngenheiros() + "\nMotoristas: " + constutora.getMotoristas());
    }
}

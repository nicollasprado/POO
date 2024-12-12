package HerancaPolimorfismo.Frete;

public class Frete {
    protected double distancia;
    protected double peso;

    public Frete(double distancia, double peso){
        this.distancia = distancia;
        this.peso = peso;
    }


    public double getValorFrete(){
        return (0.01 * (distancia * peso));
    }

    public String toString(){
        return ("Distancia: " + distancia + " Peso: " + peso + " Valor do Frete: " + getValorFrete());
    }
}

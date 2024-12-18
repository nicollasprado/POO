package HerancaPolimorfismo.Frete;

public class FreteExpresso extends Frete{
    private double seguro;

    public FreteExpresso(double distancia, double peso, double seguro){
        super(distancia, peso);
        this.seguro = seguro;
    }

    @Override
    public double getValorFrete(){
        double freteComum = ((0.01 * getPeso()) * getDistancia());
        return ((freteComum * 2) + (seguro * 0.01));
    }

    @Override
    public String toString(){
        return (super.toString() + " Seguro: " + seguro + " Valor do Frete: " + getValorFrete());
    }
}

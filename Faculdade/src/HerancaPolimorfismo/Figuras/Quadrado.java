package HerancaPolimorfismo.Figuras;

public class Quadrado extends Retangulo {
    private double lado;

    // Construtor
    public Quadrado(double lado) {
        super(lado, lado); // Define base e altura como o mesmo valor de lado
        this.lado = lado;
    }

    @Override
    public String toString() {
        return ("lado: " + lado);
    }
}

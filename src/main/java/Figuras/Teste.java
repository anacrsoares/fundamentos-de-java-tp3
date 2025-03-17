package Figuras;

public class Teste {
    public static void main(String[] args) {
        Circulo c1 = new Circulo();
        Esfera e1 = new Esfera();

        c1.raio = 2.73;
        e1.raio = 1.162;


        c1.calcularArea();
        e1.calcularVolume();
    }
}

package Figuras;

public class Esfera {
    double raio; // / o atributo raio faz parte de cálculos diversos em geometria, é fundamental que seja um
    // número real maior que 0, pois não faz sentido, do ponto de vista da física, que seja negativo

    public double calcularVolume(){
        double volume = 4/3 * Math.PI * this.raio*this.raio*this.raio;
        String msg = String.format("O volume da esfera é: %.2f cm³", volume);
        System.out.println(msg);
        return volume;
    }
}

package Figuras;

public class Circulo {
    public double raio; // o atributo raio faz parte de cálculos diversos em geometria, é fundamental que seja um
    // número real maior que 0, pois não faz sentido, do ponto de vista da física, que seja negativo
    public double area;

    public double calcularArea(){
        double area = Math.PI * this.raio * this.raio;
        String msg = String.format("A área do cículo é: %.2f cm²", area);
        System.out.println(msg);
        return area;
    }
}

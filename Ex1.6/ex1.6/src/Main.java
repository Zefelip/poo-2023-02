public class Main {
    public static void main(String[] args) {
        Quadrado quadrado = new Quadrado(5);
        Retangulo retangulo = new Retangulo(4, 6);
        Circulo circulo = new Circulo(3);
        Triangulo triangulo = new Triangulo(4, 3, 3, 5);

        Figura[] figuras = {quadrado, retangulo, circulo, triangulo};

        for (Figura figura : figuras) {
            System.out.println("Área da figura: " + figura.calcularArea());
            System.out.println("Perímetro da figura: " + figura.calcularPerimetro());

            if (figura instanceof Desenho) {
                Desenho desenho = (Desenho) figura;
                System.out.println(desenho.desenhar());
            }

            System.out.println();
        }
    }
}
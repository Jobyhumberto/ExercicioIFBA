package br.com.programacaoempar;

public class Area {

    public static void main(String[] args) {
    }

    public double areaRetangulo(double comprimento, double altura) {
        double multiplica = 0;
        multiplica += comprimento * altura;

        return multiplica;
    }

    public double perimetroRetangulo(double Base, double Lado) {
        double multiplica = 0;
        Base += Lado;
        multiplica += Base * 2;

        return multiplica;
    }

    public double areaQuadrado(double lado1, double lado2) {
        double multiplica = 0;
        multiplica += lado1 * lado2;
        return multiplica;
    }

    public double perimetroQuadrado(double lado) {
        double multiplica = 0;
        multiplica += lado * 4;
        return multiplica;
    }

    public double areaCircunferencia(double raio) { //A = π*r² A = 3,14 * r²
        double multiplica = 0;
        multiplica += raio * raio;
        return multiplica * 3.14;
    }

    public double perimetroCircunferencia(double raio) { //P = 2 * π * r
        double multiplica = 0;
        multiplica += raio * 3.14 * 2;
        return multiplica;
    }

    public double perimetroTriangulo(double base, double lado1, double lado2) {
        int soma = 0;
        soma += base += lado1 += lado2;

        return soma;
    }

    int sucessor = 0;

    public int numeroInteiroSucessor(int inteiro) {
        inteiro = inteiro;
        sucessor = inteiro + 1;
        return sucessor;
    }

    public int resultadoDivisao(int numero1, int numero2) {
        numero1 = numero1;
        numero2 = numero2;
        int quociente = numero1 / numero2;
        return quociente;
    }

}

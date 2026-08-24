public class Circulo {
    private double raio;

    public Circulo (double raio) {
        this.raio = raio;
    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

    public double calcularArea() {
        return Math.PI * Math.pow(raio, 2);
    }

    public double calcularCircunferencia() {
        return 2 * Math.PI * raio;
    }

    public static void main (String[] args) {
        double raioTeste = 5.0;
        Circulo meuCirculo = new Circulo(raioTeste);

        System.out.printf("--- Teste da Classe Circulo ---\n");
        System.out.printf("Raio do círculo: %.2f\n", meuCirculo.getRaio());
        System.out.printf("Área calculada: %.2f\n", meuCirculo.calcularArea());
        System.out.printf("Circunferência calculada: %.2f\n", meuCirculo.calcularCircunferencia());


    }
}
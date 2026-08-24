public class Viagem {
    private double distanciaKM;
    private int horas;
    private int minutos;

    public Viagem (double distanciaKM, int horas, int minutos) {
        this.distanciaKM = distanciaKM;
        this.horas = horas;
        this.minutos = minutos;
    }

    public double getDistanciaKM() {
        return distanciaKM;
    }

    public void setDistanciaKM(double distanciaKM) {
        this.distanciaKM = distanciaKM;
    }

    public int getHoras() {
        return horas;
    }

    public void setHoras(int horas) {
        this.horas = horas;
    }

    public int getMinutos () {
        return minutos;
    }

    public void setMinutos (int minutos) {
        this.minutos = minutos;
    }

    public double calcularVelocidadeMedia () {
        double tempoTotalHoras = this.horas + (this.minutos/60.0);

        if (tempoTotalHoras == 0) {
            return 0.0;
        }

        return this.distanciaKM / tempoTotalHoras;
    }

    public static void main(String[] args) {
        // Criando uma viagem de 150.5 km que demorou 2 horas e 30 minutos
        double distancia = 150.5;
        int tempoHoras = 2;
        int tempoMinutos = 30;

        // Instanciando o objeto por meio do construtor
        Viagem minhaViagem = new Viagem(distancia, tempoHoras, tempoMinutos);

        // Exibindo os resultados dos testes na tela
        System.out.println("--- Teste da Classe Viagem ---");
        System.out.printf("Distância da viagem: %.2f km\n", minhaViagem.getDistanciaKM());
        System.out.printf("Tempo total gasto: %d horas e %d minutos\n", minhaViagem.getHoras(), minhaViagem.getMinutos());
        System.out.printf("Velocidade média calculada: %.2f km/h\n", minhaViagem.calcularVelocidadeMedia());
    }

}

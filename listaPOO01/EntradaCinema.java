import java.text.Normalizer;

public class EntradaCinema {
    private String diaSemana;
    private int horario;

    public EntradaCinema (String diaSemana, int horario) {
        this.diaSemana = diaSemana;
        this.horario = horario;
    }

    public String getDiaSemana () {
        return diaSemana;
    }

    public void setDiaSemana (String diaSemana) {
        this.diaSemana = diaSemana;
    }

    public int getHorario () {
        return horario;
    }

    public void setHorario (int horario) {
        this.horario = horario;
    }

    private String normalizarDia (String dia) {
        if (dia == null) return "";
        String textoSemAcento = Normalizer.normalize(dia, Normalizer.Form.NFD).replaceAll("[^\\p{ASCII}]", "");
        return textoSemAcento.toLowerCase().replace("-feira", "").trim();
    }

    public double calcularValorInteira() {
        String diaNorm = normalizarDia(this.diaSemana);

        if (diaNorm.equals("quarta")) {
            return 8.00;
        }

        double valorBase = 0.0;

        if (diaNorm.equals("segunda") || diaNorm.equals("terca") || diaNorm.equals("quinta")) {
            valorBase = 16.00;
        } else if (diaNorm.equals("sexta") || diaNorm.equals("sabado") || diaNorm.equals("domingo")) {
            valorBase = 20.00;
        } else {
            System.out.println("Aviso: Dia da semana não reconhecido. Usando valor base padrão de R$ 16,00.");
            valorBase = 16.00;
        }

        if (this.horario >= 17 && this.horario <= 24) {
            valorBase = valorBase * 1.5;
        }

        return valorBase;
    }

    public double calcularValorMeia() {
        String diaNorm = normalizarDia(diaSemana);

        if (diaNorm.equals("quarta")) {
            return 8.00;
        }

        return calcularValorInteira() / 2.0;
    }

    public static void main(String[] args) {
        System.out.println("--- Teste de Entrada de Cinema (Java) --- \n");

        EntradaCinema s1 = new EntradaCinema("Quinta-feira", 14);
        exibirSessao(s1);

        EntradaCinema s2 = new EntradaCinema("Quinta-feira", 20);
        exibirSessao(s2);

        EntradaCinema s3 = new EntradaCinema("Quarta-feira", 21);
        exibirSessao(s3);

        EntradaCinema s4 = new EntradaCinema("Sábado", 15);
        exibirSessao(s4);

        EntradaCinema s5 = new EntradaCinema("Domingo", 19);
        exibirSessao(s5);
    }

    // Método auxiliar para formatar a saída dos testes
    public static void exibirSessao(EntradaCinema sessao) {
        System.out.printf("Sessão: %s às %dh\n", sessao.getDiaSemana(), sessao.getHorario());
        System.out.printf("  > Valor Inteira: R$ %.2f\n", sessao.calcularValorInteira());
        System.out.printf("  > Valor Meia:    R$ %.2f\n", sessao.calcularValorMeia());
        System.out.println("-----------------------------------------");
    }
}

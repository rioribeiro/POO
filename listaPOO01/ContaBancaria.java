public class ContaBancaria {
    private String titular;
    private String numeroConta;
    private double saldo;

    public ContaBancaria (String titular, String numeroConta, double saldoInicial) {
        this.titular = titular;
        this.numeroConta = numeroConta;

        if (saldoInicial >= 0) {
            this.saldo = saldoInicial;
        } else {
            this.saldo = 0.0;
        }
    }

    public String getTitular () {
        return titular;
    }

    public void setTitular (String titular) {
        this.titular = titular;
    }

    public String getNumeroConta () {
        return numeroConta;
    }

    public void setNumeroConta (String numeroConta) {
        this.numeroConta = numeroConta;
    }

    public double verificarSaldo () {
        return saldo;
    }

    public void depositar (double valor) {
        if (valor > 0) {
            this.saldo += valor;
            System.out.printf("Depósito de R$ %.2f realizado com sucesso.\n", valor);
        } else {
            System.out.println("Erro: O valor do depósito precisa ser positivo.");
        }
    }

    public boolean sacar (double valor) {
        if (valor <= 0) {
            System.out.println("Erro: O valor do saque deve ser positivo.");
            return false;
        }

        if (this.saldo >= valor) {
            this.saldo -= valor;
            System.out.printf("Saque de R$ %.2f realizado com sucesso.\n",  valor);
            return true;
        } else {
            System.out.println("Erro: Saldo insuficiente para realizar o saque.");
            return false;
        }
    }

    public static void main(String[] args) {
        ContaBancaria minhaConta = new ContaBancaria("Ana Silva", "12345-6", 500.00);

        System.out.println("--- Teste da Conta Bancária ---");
        System.out.println("Titular: " + minhaConta.getTitular());
        System.out.println("Número da Conta: " + minhaConta.getNumeroConta());
        System.out.printf("Saldo Inicial: R$ %.2f\n\n", minhaConta.verificarSaldo());

        minhaConta.depositar(150.00);
        System.out.printf("Saldo após depósito: R$ %.2f\n\n", minhaConta.verificarSaldo());

        minhaConta.sacar(200.00);
        System.out.printf("Saldo após o primeiro saque: R$ %.2f\n\n", minhaConta.verificarSaldo());

        System.out.println("Tentando sacar R$ 600,00...");
        boolean sucessoSaque = minhaConta.sacar(600.00);
        
        if (!sucessoSaque) {
            System.out.println("Operação de saque recusada pela classe.");
        }
        System.out.printf("Saldo Final: R$ %.2f\n", minhaConta.verificarSaldo());
    }
}

package ContaBancaria;

import java.text.NumberFormat;
import java.time.LocalDateTime;
import java.util.Locale;

public class Conta {
    // Atributos
    String titular; // Representa o nome do dono da conta.
    int numero; // Identifica a conta.
    String agencia; // Identifica a agência bancária.
    double saldo; // Indica o valor atualmente disponível na conta.
    String dataAbertura; //Registra quando a conta foi aberta.

    // Métodos
    public double saca(double valor){
        // recebe um valor como parâmetro e o retira do saldo da conta.

        if(valor < this.saldo && valor > 0){
            double novoSaldo = this.saldo - valor;
            System.out.println("Saque de " + formataBRL(valor) + " efetuado com sucesso. Saldo atual: " + formataBRL(novoSaldo));
            return this.saldo -= valor;
        } else {
            System.out.println("Saldo insuficiente para realizar a operação. Saldo atual: " + this.saldo);
        }
        return 0;
    }

    public double deposita(double valor){
        // recebe um valor como parâmetro e o adiciona ao saldo da conta.
        if(valor > 0){
            double novoSaldo = this.saldo + valor;
            System.out.println("Depósito de " + formataBRL(valor) + " efetuado com sucesso. Saldo atual: " + formataBRL(novoSaldo));
            return this.saldo += valor;
        } else {
            System.out.println("Digite um valor válido para depositar.");
        }
        return 0;
    }

    public double calculaRendimento(){
        // retorna o valor do saldo multiplicado por 0.1 (representando um rendimento mensal de 10%, por exemplo).
        int mesAtual = LocalDateTime.now().getMonthValue();
        int anoAtual = LocalDateTime.now().getYear();
        int diasCorridos = LocalDateTime.now().getDayOfMonth();
        int quantidadeDiasMes = LocalDateTime.MAX.getDayOfMonth();

        double taxaRendimento = 0.131/12/quantidadeDiasMes;
        double rendimento = this.saldo * taxaRendimento*diasCorridos;

        String saldoInicialFormatado = formataBRL(this.saldo);
        String rendimentoFormatado = formataBRL(rendimento);

        String msg = String.format("A taxa de rendimento anual é de 13,10%%. De acordo com seu saldo em 01/%02d/%02d: " +
                "%s, sua conta de rendimento diário rendeu %s até a data de hoje.",
                mesAtual, anoAtual, saldoInicialFormatado, rendimentoFormatado);

        System.out.println(msg);
        return rendimento;
    }

    public String formataBRL(double d){
        // extra
        NumberFormat formatter = NumberFormat.getCurrencyInstance(new Locale("pt", "BR"));
        String saldoInicialFormatado = formatter.format(d);
        return saldoInicialFormatado;
    }

    public void exibeInformacoes(){
        // extra
        System.out.println("\n---------------------------- Exibindo Informacoes da Conta ----------------------------");
        System.out.println("Titular: " + this.titular);
        System.out.println("Número da conta: " + this.numero);
        System.out.println("Número da agência: " + this.agencia);
        System.out.println("Saldo da conta: " + formataBRL(this.saldo));
        System.out.println("Data de Abertura: " + this.dataAbertura);
        System.out.println("---------------------------------------------------------------------------------------\n");
    }
}

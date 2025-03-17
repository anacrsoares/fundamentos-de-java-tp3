package ContaBancaria;

public class TestaConta {
    public static void main(String[] args) {
        Conta c1 = new Conta();

        c1.titular = "José da Silva";
        c1.numero = 123777900;
        c1.agencia = "4109-X";
        c1.saldo = 10099.5;
        c1.dataAbertura = "25/01/2011";

        c1.exibeInformacoes();
        c1.saca(22.99);
        c1.deposita(45.5);
        c1.calculaRendimento();
        c1.exibeInformacoes();
    }
}

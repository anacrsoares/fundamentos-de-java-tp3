package Supermercado.Produto;

public class AppProduto {
    public static void main(String[] args) {
        Produto p2 = new Produto("Café", 40.33, 100);

        System.out.println("=============================================================================");
        System.out.println("======================== Antes da alteracao de preco ========================");
        System.out.println("=============================================================================");
        p2.exibirInformacoes();
        System.out.println("\n");
        System.out.println("=============================================================================");
        System.out.println("======================== Depois da alteracao de preco =======================");
        System.out.println("=============================================================================");
        p2.alterarPreco(39.88);
        p2.exibirInformacoes();
        System.out.println("\n");
        System.out.println("=============================================================================");
        System.out.println("======================== Depois da alteracao de qtde. =======================");
        System.out.println("=============================================================================");
        p2.alterarQuantidade(98);
        p2.exibirInformacoes();
    }
}

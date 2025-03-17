package Supermercado.Produto;

public class TestGettersNSetters {
    public static void main(String[] args) {
        Produto teste = new Produto("Macarrao", 6.5, 240);
        System.out.println("=========================== Teste Getters 'n' Setters ===========================");

        // Primeiro
        teste.exibirInformacoes();
        System.out.println("Resultado inicial de Object.getNome(): " + teste.getNome());
        System.out.println("Aplicando Object.setNome(\"Spoletto\")...");
        teste.setNome("Spoletto");
//        teste.exibirInformacoes();
        System.out.println("Resultado final de Object.getNome(): " + teste.getNome());

        // Segundo
        teste.exibirInformacoes();
        System.out.println("Resultado inicial de Object.getPreco(): " + teste.getPreco());
        System.out.println("Aplicando Object.setPreco(6.7)...");
        teste.setPreco(6.7);
//        teste.exibirInformacoes();
        System.out.println("Resultado final de Object.getPreco(): " + teste.getPreco());

        // Terceiro
        teste.exibirInformacoes();
        System.out.println("Resultado inicial de Object.getQuantidadeEmEstoque(): " + teste.getQuantidadeEmEstoque());
        System.out.println("Aplicando Object.setQuantidadeEmEstoque(200)...");
        teste.setQuantidadeEmEstoque(200);
        //        teste.exibirInformacoes();
        System.out.println("Resultado final de Object.getQuantidadeEmEstoque(): " + teste.getQuantidadeEmEstoque());

    }
}

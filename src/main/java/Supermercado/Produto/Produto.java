package Supermercado.Produto;

public class Produto {
    private String nome; // importancia: identificacao do objeto
    private double preco; // importancia: dado util para calculo de lucro/prejuizo do supermercado
    private int quantidadeEmEstoque; // importancia: dado util para gerenciamento

    @Override
    public String toString() {
        return String.format("Nome do Produto: %s | Preço: R$ %.2f | Quantidade em Estoque: %d", nome, preco, quantidadeEmEstoque);
    }

    public Produto(String nome, double preco, int quantidadeEmEstoque) {
        this.nome = nome;
        this.preco = preco;
        this.quantidadeEmEstoque = quantidadeEmEstoque;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco(){
        return this.preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public void alterarPreco(double novoPreco){
        setPreco(novoPreco);
    }

    public int getQuantidadeEmEstoque() {
        return quantidadeEmEstoque;
    }

    public void setQuantidadeEmEstoque(int quantidadeEmEstoque) {
        this.quantidadeEmEstoque = quantidadeEmEstoque;
    }

    public void alterarQuantidade(int novaQuantidadeEmEstoque){
        setQuantidadeEmEstoque(novaQuantidadeEmEstoque); // metodo para alterar a qtde. em estoque
    }

    public void exibirInformacoes(){
        System.out.println("--------------------------- Exibicao de Informacoes ---------------------------");
        System.out.println(this);
    }

    // Implementacao dos metodos criados
    public static void main(String[] args) {
        // 1- Implementar Metodo de Atualização de Preço
        Produto p1 = new Produto("Arroz", 10.75, 20);
        p1.exibirInformacoes();
        p1.alterarPreco(21.30);
        p1.exibirInformacoes();

        p1.alterarQuantidade(10);
        p1.exibirInformacoes();

    }
}

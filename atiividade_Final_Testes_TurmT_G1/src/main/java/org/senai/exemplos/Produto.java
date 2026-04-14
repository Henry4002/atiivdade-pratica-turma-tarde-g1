package main.java.org.senai.exemplos;

// Superclasse
public abstract class Produto {
    private String nome;
    private double preco;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public void calcularDesconto(double percentual) {

        double desconto = preco - (preco*percentual/100);
        System.out.println("O valor do "+getNome()+" com desconto: "+desconto);
    }

    public void exibirInfo() {
        System.out.println("Produto: " + nome + " - Preço: " + preco);
    }
}

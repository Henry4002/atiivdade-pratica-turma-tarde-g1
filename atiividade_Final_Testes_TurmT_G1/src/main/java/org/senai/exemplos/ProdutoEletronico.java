package main.java.org.senai.exemplos;

public class ProdutoEletronico extends Produto {
    private int garantiaMeses;

    public ProdutoEletronico(String nome, double preco, int garantiaMeses) {
        super(nome, preco);
        this.garantiaMeses = garantiaMeses;
    }

    @Override
    public void calcularDesconto(double percentual) {
        double desconto = getPreco() - (getPreco()*percentual/100) - 10;;
        System.out.println("O valor do "+getNome()+" com desconto: "+desconto);
    }

    public void exibirGarantia() {
        System.out.println("Garantia do(a) "+getNome()+": " + garantiaMeses + " meses");
    }

    public int getGarantiaMeses() {
        return garantiaMeses;
    }

    public void setGarantiaMeses(int garantiaMeses) {
        this.garantiaMeses = garantiaMeses;
    }
}

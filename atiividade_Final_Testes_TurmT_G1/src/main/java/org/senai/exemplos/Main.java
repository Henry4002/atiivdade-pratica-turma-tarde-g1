package main.java.org.senai.exemplos;

// Classe principal
public class Main {
    public static void main(String[] args) {
        ProdutoEletronico p1 = new ProdutoEletronico ("TV",1500,12);
        p1.exibirInfo();
        p1.exibirGarantia();
        p1.calcularDesconto(20);

        ProdutoEletronico p2 = new ProdutoEletronico("Xbox", 2000,24);
        p2.exibirInfo();
        p2.exibirGarantia();
        p2.calcularDesconto(50);

         }
}
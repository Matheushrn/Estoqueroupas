package main;

public class Roupas {
    public String marca;
    public String tipo;
    public String tamanho;
    public int quantidade;
    public double preco;

    public double valorProduto() {
        return this.preco * this.quantidade;
    }

    public int addNovaRoupa() {
        return this.quantidade++;
    }

    public int removeRoupa() {
        if (this.quantidade > 0) {
            return this.quantidade--;
        } else {
            System.out.println("Não há roupas para remover.");
            return 0;
        }
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public String getQuantidade() {
        return String.valueOf(this.quantidade);
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public String getMarca() {
        return marca;
    }

    public String getTipo() {
        return tipo;
    }

    public String getTamanho() {
        return tamanho;
    }

    public double getPreco() {
        return preco;
    }
}
package main;

import java.util.ArrayList;
import java.util.List;

public class Main {
	    public static void main(String[] args) {
	        List<Roupas> roupas = new ArrayList<>();

	        Roupas roupa1 = new Roupas();
	        roupa1.setMarca("Nike");
	        roupa1.setTipo("Camiseta");
	        roupa1.setTamanho("M");
	        roupa1.setQuantidade(10);
	        roupa1.setPreco(29.99);
	        roupas.add(roupa1);

	        Roupas roupa2 = new Roupas();
	        roupa2.setMarca("High");
	        roupa2.setTipo("Calça");
	        roupa2.setTamanho("GG");
	        roupa2.setQuantidade(5);
	        roupa2.setPreco(49.99);
	        roupas.add(roupa2);

	        Roupas roupa3 = new Roupas();
	        roupa3.setMarca("Nike");
	        roupa3.setTipo("Jaqueta");
	        roupa3.setTamanho("GG");
	        roupa3.setQuantidade(3);
	        roupa3.setPreco(99.99);
	        roupas.add(roupa3);

	        Roupas roupa4 = new Roupas();
	        roupa4.setMarca("Vans");
	        roupa4.setTipo("Tênis");
	        roupa4.setTamanho("G");
	        roupa4.setQuantidade(7);
	        roupa4.setPreco(39.99);
	        roupas.add(roupa4);

	        for (Roupas roupa : roupas) {
	            System.out.println("Marca: " + roupa.getMarca());
	            System.out.println("Tipo: " + roupa.getTipo());
	            System.out.println("Tamanho: " + roupa.getTamanho());
	            System.out.println("Quantidade: " + roupa.getQuantidade());
	            System.out.println("Preço unitário: " + roupa.getPreco());
	            System.out.println("Valor total: " + roupa.valorProduto() + "\n" );
	        }
	    }
	}


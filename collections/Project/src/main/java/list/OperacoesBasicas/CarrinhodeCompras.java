package main.java.list.OperacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class CarrinhodeCompras {
    private List<Item> itensList;

    public CarrinhodeCompras() {
        this.itensList = new ArrayList<>();
    }

    public void addItem(String name, double price, int quantidade){
        itensList.add(new Item(name, price, quantidade));
    }

    public void removeItem(String name){
        List<Item> listaParaRemover = new ArrayList<>();

        for (Item i : itensList) {
            if(i.getName().equalsIgnoreCase(name)){
                listaParaRemover.add(i);
            }
        }

        itensList.removeAll(listaParaRemover);
    }

    public double calcularValorTotal() {
        double total = 0.0;
        if (!itensList.isEmpty()){
            for (Item i: itensList) {
                total += i.getQuantidade() * i.getPrice();
            }
        }
        return total;
    }

    public void exibiritens(){
        System.out.println(itensList);
    }


    public static void main(String[] args) {
        CarrinhodeCompras carrinho1 = new CarrinhodeCompras();

        carrinho1.addItem("Café", 3.50, 2);

        carrinho1.addItem("Mamão", 9.40, 9);

        carrinho1.removeItem("Mamão");

        carrinho1.addItem("Cartão de compras no Xbox", 67.89, 2 );
        carrinho1.addItem("Ração para filhotes", 14.90, 2);
        carrinho1.addItem("Gabinete para PC", 109.90, 1);

        carrinho1.exibiritens();

        System.out.println(carrinho1.calcularValorTotal());

    }
}


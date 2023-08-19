package main.java.list.OperacoesBasicas;

public class Item {
    private String name;
    private double price;
    private int quantidade;

    public Item(String name, double price, int quantidade) {
        this.name = name;
        this.price = price;
        this.quantidade = quantidade;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantidade() {
        return quantidade;
    }

    @Override
    public String toString() {
        return "Item{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", quantidade=" + quantidade +
                '}';
    }
}

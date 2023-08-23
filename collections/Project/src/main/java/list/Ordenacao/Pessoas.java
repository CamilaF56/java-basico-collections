package main.java.list.Ordenacao;

import java.util.Comparator;

public class Pessoas implements Comparable<Pessoas>{
    private String name;
    private int idade;
    private double altura;

    public Pessoas(String name, int idade, double altura) {
        this.name = name;
        this.idade = idade;
        this.altura = altura;
    }

    @Override
    public int compareTo(Pessoas p) {
        return Integer.compare(idade, p.getIdade());
    }


    public String getName() {
        return name;
    }
    public int getIdade() {
        return idade;
    }

    public double getAltura() {
        return altura;
    }

    @Override
    public String toString() {
        return "Pessoas{" +
                "name='" + name + '\'' +
                ", idade=" + idade +
                ", altura=" + altura +
                '}';
    }


}


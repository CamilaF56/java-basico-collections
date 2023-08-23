package main.java.list.Ordenacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static java.util.Collections.sort;

public class OrdenacaoPessoas{
    private List<Pessoas> listaPessoas;

    public OrdenacaoPessoas() {
        listaPessoas = new ArrayList<>();
    }

    public void addPessoas(String name, int idade, double altura){
        listaPessoas.add(new Pessoas(name,idade,altura));
    }

    public List<Pessoas> ordenarIdade(){
        List<Pessoas> pessoasOrdenadasIdade = new ArrayList<>(listaPessoas);
        sort(pessoasOrdenadasIdade);
        return pessoasOrdenadasIdade;
    }

    public List<Pessoas> ordenarAltura(){
        List<Pessoas> pessoasOrdenadasAltura = new ArrayList<>(listaPessoas);
        Collections.sort(pessoasOrdenadasAltura, new ComparatorPorAltura());
        return pessoasOrdenadasAltura;
    }

    public static void main(String[] args) {
        OrdenacaoPessoas o1 = new OrdenacaoPessoas();

        o1.addPessoas("Camila", 20, 1.53);
        o1.addPessoas("Vania", 49, 1.53);
        o1.addPessoas("Brenno", 27, 1.65);
        o1.addPessoas("Pureza", 70, 1.48);


        System.out.println(o1.ordenarIdade());
        System.out.println(o1.ordenarAltura());
    }

}
package main.java.list.Ordenacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoNumeros implements Comparable<Integer>{
    private List<Integer> listaNumeros = new ArrayList<>();

    public List<Integer> addNumber(int number){
        listaNumeros.add(number);
        return listaNumeros;
    }

    // usar comparable
    public List<Integer> ordenarAscendente(){
        List<Integer> lista = new ArrayList<Integer>(listaNumeros);
        Collections.sort(lista);
        return lista;
    }

    // usar comparable
    public List<Integer> ordenarDescendente(){
        List<Integer> lista = new ArrayList<Integer>(listaNumeros);
        Collections.sort(lista);
        Collections.reverse(lista);
        return lista;
    }
    @Override
    public int compareTo(Integer n) {
        return 0;
    }

    public static void main(String[] args) {
        OrdenacaoNumeros o1 = new OrdenacaoNumeros();

        o1.addNumber(1);
        o1.addNumber(39);
        o1.addNumber(23);
        o1.addNumber(17);

        System.out.println(o1.ordenarAscendente());
        System.out.println(o1.ordenarDescendente());
    }
}

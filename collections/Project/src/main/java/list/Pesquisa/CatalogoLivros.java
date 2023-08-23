package main.java.list.Pesquisa;

import java.util.ArrayList;
import java.util.List;

public class CatalogoLivros {
    private List<Livro> listBooks;

    public CatalogoLivros() {
        this.listBooks = new ArrayList<>();
    }

    public void addBooks(String titulo, String autor, int anoPublicacao) {
        listBooks.add(new Livro(titulo, autor, anoPublicacao));
    }

    public List<Livro> pesquisarPorAutor(String autor) {
        List<Livro> livrosPorAutor = new ArrayList<>();

        if (!listBooks.isEmpty()) {
            for (Livro l : listBooks) {
                if (l.getAutor().equalsIgnoreCase(autor)) {
                    livrosPorAutor.add(l);
                }
            }
        }

        return livrosPorAutor;
    }

    public List<Livro> pesquisarPorIntervaloAnos(int anoInicial, int anoFinal) {
        List<Livro> livrosPorIntervaloAnos = new ArrayList<>();

        if (!listBooks.isEmpty()) {
            for (Livro l : listBooks) {
                if (l.getAnoPublicacao() >= anoInicial && l.getAnoPublicacao() <= anoFinal) {
                    livrosPorIntervaloAnos.add(l);
                }
            }
        }

        return livrosPorIntervaloAnos;
    }

    public Livro pesquisarPorTitulo(String titulo) {
        Livro livroPorTitulo = null;

        if(!listBooks.isEmpty()){
            for (Livro l: listBooks) {
                if(l.getTitulo().equalsIgnoreCase(titulo)){
                    livroPorTitulo = l;
                    break;
                }
            }
        }

        return livroPorTitulo;
    }

    public static void main(String[] args) {
        CatalogoLivros livrosVendidos = new CatalogoLivros();

        livrosVendidos.addBooks("O Senhor dos Anéis: A Sociedade do Anel", "J. R. R. Tolkien", 1954);
        livrosVendidos.addBooks("A lógica do cisne negro", "Nassim Nicholas Taleb", 2021);
        livrosVendidos.addBooks("Livro 2", "Camila", 2021);
        livrosVendidos.addBooks("Livro 2", "Fontes", 2019);

        System.out.println(livrosVendidos.pesquisarPorAutor("Fontes"));

        System.out.println(livrosVendidos.pesquisarPorTitulo("Livro 2"));

        System.out.println(livrosVendidos.pesquisarPorIntervaloAnos(2019, 2019));

    }
}



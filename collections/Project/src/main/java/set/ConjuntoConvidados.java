package main.java.set;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoConvidados{
    private Set<Convidado> setConvidado;

    public ConjuntoConvidados() {
        this.setConvidado = new HashSet<>();
    }
    public void adicionarConvite(String nome, int codigoConvite){
        setConvidado.add(new Convidado(nome, codigoConvite));
    }

    public void removerPorCodigoConvite(int codigoConvite){
        Convidado convidadoParaRemover = null;
        for (Convidado c: setConvidado) {
            if(c.getCodigoConvite() == codigoConvite){
                convidadoParaRemover = c;
                break;
            }else {
                System.out.println("Ops, não existe nenhum convidado com esse convite!");
            }
        }
        setConvidado.remove(convidadoParaRemover);
    }

    public int contarConvidados(){
        return setConvidado.size();
    }

    public void exibirConvidados(){
        System.out.println(setConvidado);
    }


    public static void main(String[] args) {
        ConjuntoConvidados niverLaila = new ConjuntoConvidados();

        niverLaila.adicionarConvite("Camila", 477);
        niverLaila.adicionarConvite("Miguel", 474);

        niverLaila.exibirConvidados();
        System.out.println(niverLaila.contarConvidados());
        niverLaila.removerPorCodigoConvite(474);
        niverLaila.exibirConvidados();
        System.out.println(niverLaila.contarConvidados());

    }
}

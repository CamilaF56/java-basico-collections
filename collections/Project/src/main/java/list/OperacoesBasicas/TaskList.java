package main.java.list.OperacoesBasicas;

import java.util.ArrayList;
import java.util.List;
import java.lang.String;

public class TaskList {
    //atributo listaTarefas
    private List<Task> tarefaList;

    public TaskList() {
        this.tarefaList = new ArrayList<>();
    }

    public void addTask(String description){
        tarefaList.add(new Task(description));
    }
    public void getDescriptionTask(){
        System.out.println(tarefaList);
    }
    public void removeTask(String description){
        // ArrayList para add tarefas que precisam ser removidas
        List<Task> tarefasParaRemover = new ArrayList<>();

        for (Task t : tarefaList) {
            if(t.getDescription().equalsIgnoreCase(description)){
                tarefasParaRemover.add(t);
            }
        }
        tarefaList.removeAll(tarefasParaRemover);
    }

    public int getNumberTaskTotal(){
        return tarefaList.size();
    }


    public static void main(String[] args) {
        TaskList lista = new TaskList();

        lista.addTask("Task do AmongUs");
        lista.addTask("Task do Habbo");
        lista.addTask("Task do AmongUs");
        lista.addTask("Task do The Sims 4");

        lista.removeTask("Task do Habbo");

        lista.getDescriptionTask();

        if(lista.getNumberTaskTotal() == 0){
            System.out.println("Lista vazia");
        }else{
            System.out.println("Esse eh o número de tarefas na lista: " + lista.getNumberTaskTotal());
        }

    }

}
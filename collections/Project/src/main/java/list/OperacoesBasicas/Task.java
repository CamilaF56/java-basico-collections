package main.java.list.OperacoesBasicas;

import java.lang.String;

public class Task {
    private String description;

    public String getDescription() {
        return description;
    }

    // Construtor
    public Task(String description) {
        this.description = description;
    }
    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return description;
    }
}
package com.mycompany.privatefit;

public class Treino {
    private int id;
    private String tipoTreino;
    private String exercicio;
    private int series;
    private int repeticoes;

    public Treino(int id, String tipoTreino, String exercicio, int series, int repeticoes) {
        this.id = id;
        this.tipoTreino = tipoTreino;
        this.exercicio = exercicio;
        this.series = series;
        this.repeticoes = repeticoes;
    }
    
    public int getSeries() {
        return series;
    }

    public void setSeries(int series) {
        this.series = series;
    }

    public int getRepeticoes() {
        return repeticoes;
    }

    public void setRepeticoes(int repeticoes) {
        this.repeticoes = repeticoes;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTipoTreino() {
        return tipoTreino;
    }

    public void setTipoTreino(String tipoTreino) {
        this.tipoTreino = tipoTreino;
    }

    public String getExercicio() {
        return exercicio;
    }

    public void setExercicio(String exercicio) {
        this.exercicio = exercicio;
    }

    
    
    
}

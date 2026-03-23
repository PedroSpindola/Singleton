package org.example.model;

public class Estacionamento {

    private Estacionamento(){}

    private static Estacionamento instance;
    private Integer vagasDisponivel;

    public static Estacionamento getInstance(){
        if (instance == null){
            instance = new Estacionamento();
        }
        return instance;
    }

    public Integer getVagasDisponivel() {
        return vagasDisponivel;
    }

    public void setVagasDisponivel(Integer vagasDisponivel) {
        this.vagasDisponivel = vagasDisponivel;
    }

    public boolean registrarEntrada() {
        if (vagasDisponivel > 0) {
            vagasDisponivel--;

            return true;
        }
        return false;
    }

    public String registrarSaida() {
        vagasDisponivel++;
        return "Carro saiu. Vagas restantes: " + vagasDisponivel;
    }

}

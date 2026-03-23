package org.example.test;

import org.example.model.Estacionamento;
import org.junit.Test;
import static org.junit.Assert.*;

public class EstacionamentoTeste {

    @Test
    public void deveRetornarVagasDisponivel(){
        Estacionamento.getInstance().setVagasDisponivel(100);
        assertEquals(100,(int)Estacionamento.getInstance().getVagasDisponivel());
    }
    @Test
    public void deveRegistrarEntradaTrue(){
        Estacionamento.getInstance().setVagasDisponivel(1);
        assertEquals(true,Estacionamento.getInstance().registrarEntrada());
    }
    @Test
    public void deveRegistrarEntradaFalse(){
        Estacionamento.getInstance().setVagasDisponivel(0);
        assertEquals(false,Estacionamento.getInstance().registrarEntrada());
    }

    @Test
    public void deveRegistrarSaida(){
        Estacionamento.getInstance().setVagasDisponivel(0);
        assertEquals("Carro saiu. Vagas restantes: 1", Estacionamento.getInstance().registrarSaida());
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import data.*;
import javafx.beans.property.SimpleStringProperty;

/**
 *
 * @author Gloria
 */
public class Modelo {
    private Gestor gestor;
    private SimpleStringProperty nombreProyecto;
    private SimpleStringProperty duennoProyecto;
    private SimpleStringProperty precioInicial;
    private SimpleStringProperty precioReserva;
    private SimpleStringProperty aportanteFinal;
    private SimpleStringProperty tasaInteresAportanteFinal;

    public Modelo(Gestor gestor) {
        this.gestor = gestor;
        this.nombreProyecto = new SimpleStringProperty(gestor.getProyectos().get(0).getNombre());
        this.duennoProyecto = new SimpleStringProperty(gestor.getProyectos().get(0).getPromotor().getID());
    }

    public Gestor getGestor() {
        return gestor;
    }

    public void setGestor(Gestor gestor) {
        this.gestor = gestor;
    }
    
    
    
}

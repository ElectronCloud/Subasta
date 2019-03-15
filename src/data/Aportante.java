/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

/**
 *
 * @author Gloria
 */
public class Aportante {
    private String ID;
    private double tasaInteres;
    private int plazo;
    private double precioAceptable;

    public Aportante(String ID, double tasaInteres, int plazo, double precioAceptable) {
        this.ID = ID;
        this.tasaInteres = tasaInteres;
        this.plazo = plazo;
        this.precioAceptable = precioAceptable;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public double getTasaInteres() {
        return tasaInteres;
    }

    public void setTasaInteres(double tasaInteres) {
        this.tasaInteres = tasaInteres;
    }

    public int getPlazo() {
        return plazo;
    }

    public void setPlazo(int plazo) {
        this.plazo = plazo;
    }

    public double getPrecioAceptable() {
        return precioAceptable;
    }

    public void setPrecioAceptable(int precioAceptable) {
        this.precioAceptable = precioAceptable;
    }
    
    
}

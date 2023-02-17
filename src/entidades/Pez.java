/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

/**
 *
 * @author Nacho
 */
public class Pez {
    private String especie;
    private String color;
    private String tamanio;

    public Pez() {
    }

    public Pez(String especie, String color, String tamanio) {
        this.especie = especie;
        this.color = color;
        this.tamanio = tamanio;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getTamanio() {
        return tamanio;
    }

    public void setTamanio(String tamanio) {
        this.tamanio = tamanio;
    }

    @Override
    public String toString() {
        return "Pez" + " Especie= " + especie + ", Color= " + color + ", Tamaño= " + tamanio;
    }
    
}

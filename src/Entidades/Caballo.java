
package Entidades;

public class Caballo {
    
    private String color;
    private int peso;
    private String raza;
    private String largoPelo;
    private int herradura;
    private boolean riendas;

    public Caballo(String color, int peso, String raza, String largoPelo, int herradura, boolean riendas) {
        this.color = color;
        this.peso = peso;
        this.raza = raza;
        this.largoPelo = largoPelo;
        this.herradura = herradura;
        this.riendas = riendas;
    }

    public Caballo() {
    }

    public String getColor() {
        return color;
    }

    public int getPeso() {
        return peso;
    }

    public String getRaza() {
        return raza;
    }

    public String getLargoPelo() {
        return largoPelo;
    }

    public int getHerradura() {
        return herradura;
    }

    public boolean isRiendas() {
        return riendas;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public void setLargoPelo(String largoPelo) {
        this.largoPelo = largoPelo;
    }

    public void setHerradura(int herradura) {
        this.herradura = herradura;
    }

    public void setRiendas(boolean riendas) {
        this.riendas = riendas;
    }
    
    
    
    
}

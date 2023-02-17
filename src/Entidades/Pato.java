package github_ejercicio_02;

public class Pato {
    private String nombre;
    private String apellido;
    private int edad;
    private int patas;
    private boolean tienePlumas;

    public Pato() {
    }

    public Pato(String nombre, String apellido, int edad, int patas, boolean tienePlumas) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.patas = patas;
        this.tienePlumas = tienePlumas;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getPatas() {
        return patas;
    }

    public void setPatas(int patas) {
        this.patas = patas;
    }

    public boolean isTienePlumas() {
        return tienePlumas;
    }

    public void setTienePlumas(boolean tienePlumas) {
        this.tienePlumas = tienePlumas;
    }

    @Override
    public String toString() {
        return "Pato{" + "nombre=" + nombre + ", apellido=" + apellido + ", edad=" + edad + ", patas=" + patas + ", tienePlumas=" + tienePlumas + '}';
    }
    
}

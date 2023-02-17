package Entidades;

public class Gato {
    
    private String nombre,apellido,apodo,color;
    private Integer edad;
    private Boolean tieneCola;

    public Gato() {
    }

    public Gato(String nombre, String apellido, String apodo, String color, Integer edad, Boolean tieneCola) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.apodo = apodo;
        this.color = color;
        this.edad = edad;
        this.tieneCola = tieneCola;
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

    public String getApodo() {
        return apodo;
    }

    public void setApodo(String apodo) {
        this.apodo = apodo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public Boolean getTieneCola() {
        return tieneCola;
    }

    public void setTieneCola(Boolean tieneCola) {
        this.tieneCola = tieneCola;
    }

    @Override
    public String toString() {
        return "Gato:  Mariano: " + nombre 
                    +" Apellido: " + apellido 
                    +" Apodo: " + apodo 
                    +" Color=" + color 
                    +" Edad=" + edad 
                    +"TieneCola=" + tieneCola;
    }
    
    
    
    
}

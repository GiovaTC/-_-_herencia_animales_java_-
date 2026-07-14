package main.java.com.ejemplo.animales;

public class Animal {

    protected String nombre;
    protected  int edad;

    public Animal(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public void mostrarDatos() {

        System.out.println("Nombre : " + nombre);
        System.out.println("Edad   : " + edad);
    }

    public void hacerSonido() {
        System.out.println("El animal hace un sonido.");
    }
}

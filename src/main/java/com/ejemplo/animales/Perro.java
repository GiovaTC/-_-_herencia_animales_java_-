package main.java.com.ejemplo.animales;

public class Perro extends Animal {

    public Perro(String nombre, int edad) {
        super(nombre, edad);
    }

    @Override
    public void hacerSonido() {
        System.out.println(nombre + " dice: Guau Guau");
    }

    public void correr() {
        System.out.println(nombre + " está corriendo.");
    }
}

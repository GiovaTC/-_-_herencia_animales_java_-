package main.java.com.ejemplo.animales;

public class Gato extends Animal {

    public Gato(String nombre, int edad) {
        super(nombre, edad);
    }

    @Override
    public void hacerSonido() {
        System.out.println(nombre + " dice: Miau Miau");
    }

    public void dormir() {
        System.out.println(nombre + " está durmiendo.");
    }
}

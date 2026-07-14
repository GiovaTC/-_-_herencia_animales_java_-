package main.java.com.ejemplo.animales;

public class Main {

    public static void main(String[] args) {

        Perro perro = new Perro("Max", 5);
        Gato gato = new Gato("Michi", 3);

        System.out.println("===== PERRO =====");

        perro.mostrarDatos();
        perro.hacerSonido();
        perro.correr();

        System.out.println();

        System.out.println("===== GATO =====");

        gato.mostrarDatos();
        gato.hacerSonido();
        gato.dormir();
    }   
}
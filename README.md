# -_-_herencia_animales_java_- :.
# 🐾 HerenciaAnimalesJava:

<img width="1254" height="1254" alt="image" src="https://github.com/user-attachments/assets/5b0dcb3b-9e4a-4f0e-8b87-213f514046c3" />  

```

Proyecto muy básico desarrollado en **Java 21** utilizando **IntelliJ IDEA**, cuyo objetivo es demostrar el concepto de **Herencia** en la Programación Orientada a Objetos (POO).

---

# 📋 Descripción

El programa implementa una jerarquía simple de clases donde una clase base (**Animal**) es heredada por dos clases derivadas (**Perro** y **Gato**).

Cada clase hija reutiliza los atributos y métodos heredados, además de sobrescribir el comportamiento del método encargado de emitir un sonido.

La aplicación se ejecuta completamente desde la consola.

---

# 🎯 Objetivos

El programa permite:

- ✅ Crear una clase base **Animal**
- ✅ Crear la clase **Perro** que hereda de **Animal**
- ✅ Crear la clase **Gato** que hereda de **Animal**
- ✅ Instanciar objetos
- ✅ Utilizar constructores
- ✅ Reutilizar métodos heredados
- ✅ Sobrescribir métodos mediante `@Override`
- ✅ Ejecutar la aplicación desde consola

---

# 🛠 Tecnologías utilizadas

- **Java 21**
- **IntelliJ IDEA**
- Programación Orientada a Objetos (POO)

---

# 📁 Estructura del proyecto

```text
HerenciaAnimalesJava
│
└── src
    └── main
        └── java
            └── com
                └── ejemplo
                    └── animales
                        │
                        ├── Animal.java
                        ├── Perro.java
                        ├── Gato.java
                        └── Main.java
```

---

# 📄 Clase `Animal.java`

```java
package com.ejemplo.animales;

public class Animal {

    protected String nombre;
    protected int edad;

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
```

---

# 📄 Clase `Perro.java`

```java
package com.ejemplo.animales;

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
```

---

# 📄 Clase `Gato.java`

```java
package com.ejemplo.animales;

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
```

---

# 📄 Clase `Main.java`

```java
package com.ejemplo.animales;

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
```

---

# ▶️ Ejecución

Al ejecutar la aplicación desde IntelliJ IDEA se obtiene la siguiente salida:

```text
===== PERRO =====
Nombre : Max
Edad   : 5
Max dice: Guau Guau
Max está corriendo.

===== GATO =====
Nombre : Michi
Edad   : 3
Michi dice: Miau Miau
Michi está durmiendo.
```

---

# 🧬 Explicación de la Herencia

```text
                 Animal
            ----------------
            nombre
            edad
            mostrarDatos()
            hacerSonido()
                  ▲
        ┌─────────┴─────────┐
        │                   │
      Perro               Gato
      correr()            dormir()
      hacerSonido()       hacerSonido()
```

La clase **Animal** actúa como **superclase**.

Las clases **Perro** y **Gato** son **subclases** que heredan:

- Los atributos.
- El constructor.
- Los métodos comunes.

Cada subclase redefine (`@Override`) el método `hacerSonido()` para proporcionar un comportamiento específico.

---

# 🔄 Funcionamiento del programa

1. Se crea un objeto de tipo **Perro**.
2. Se crea un objeto de tipo **Gato**.
3. Cada objeto muestra sus datos.
4. Cada objeto ejecuta su propio sonido.
5. Cada clase utiliza un método exclusivo:
   - `correr()` para el perro.
   - `dormir()` para el gato.

---

# 🧠 Conceptos de Programación Orientada a Objetos aplicados

Este proyecto implementa los siguientes conceptos fundamentales:

- ✅ Clases
- ✅ Objetos
- ✅ Herencia (`extends`)
- ✅ Constructores
- ✅ Encapsulamiento básico
- ✅ Sobrescritura de métodos (`@Override`)
- ✅ Polimorfismo
- ✅ Instanciación de objetos
- ✅ Reutilización de código

---

# 📚 Explicación de los conceptos utilizados

## Clase

Una clase es una plantilla para crear objetos.

En este proyecto:

- `Animal`
- `Perro`
- `Gato`

son clases.

---

## Objeto

Un objeto es una instancia de una clase.

Ejemplo:

```java
Perro perro = new Perro("Max", 5);
```

---

## Herencia

La herencia permite que una clase reutilice atributos y métodos de otra clase.

```java
public class Perro extends Animal
```

Aquí, `Perro` hereda todo lo que posee `Animal`.

---

## Constructor

Inicializa los atributos de un objeto.

```java
public Animal(String nombre, int edad)
```

Las clases hijas utilizan:

```java
super(nombre, edad);
```

para invocar el constructor de la superclase.

---

## Sobrescritura de métodos

Consiste en redefinir un método heredado para cambiar su comportamiento.

```java
@Override
public void hacerSonido()
```

Cada animal produce un sonido diferente.

---

## Polimorfismo

Aunque ambos objetos son animales, cada uno ejecuta una implementación distinta de `hacerSonido()`.

```java
perro.hacerSonido();
gato.hacerSonido();
```

El resultado depende del tipo real del objeto.

---

## Encapsulamiento básico

Los atributos están protegidos mediante el modificador:

```java
protected
```

Esto permite que las clases hijas puedan acceder a ellos sin exponerlos públicamente.

---

# ✅ Resultado final

Este proyecto constituye un ejemplo sencillo y didáctico para comprender uno de los pilares fundamentales de la Programación Orientada a Objetos: **la Herencia**.

A través de una jerarquía simple de clases se demuestra cómo reutilizar código, especializar comportamientos mediante la sobrescritura de métodos y organizar aplicaciones de forma más clara, modular y mantenible.

Es un excelente punto de partida para continuar aprendiendo conceptos más avanzados como el polimorfismo, las clases abstractas y las interfaces en Java.

---

# 👨‍💻 Autor

Proyecto educativo desarrollado en:

- **Java 21**
- **IntelliJ IDEA**
- **Programación Orientada a Objetos (POO)**

---
**Licencia:** Uso libre con fines educativos .    

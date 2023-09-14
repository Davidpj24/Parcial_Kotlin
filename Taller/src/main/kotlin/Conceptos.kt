/*
Herencia definición

La herencia es un concepto en programación que permite que una clase (llamada clase hija o subclase)
herede propiedades y comportamientos de otra clase (llamada clase padre o superclase).
En Kotlin, se utiliza la palabra clave :, seguida del nombre de la superclase, para declarar una clase hija.
 */

/* Clase padre o superclase*/
open class Animal(val nombre: String) {
    open fun hacerSonido() {
        println("$nombre hace un sonido indefinido")
    }
}

/*Clase hija o subclase*/
class Perro(nombre: String) : Animal(nombre) {
    override fun hacerSonido() {
        println("$nombre ladra")
    }
}

fun main() {
    val miAnimal: Animal = Perro("Max")
    miAnimal.hacerSonido()
}


/*
Data Class
Una data class en Kotlin es una clase que está diseñada principalmente para almacenar datos.
Kotlin genera automáticamente funciones útiles como equals(), hashCode(), toString(), etc., en función
de las propiedades declaradas en la data class.
 */

/* Declaración de una data class*/
data class Persona(val nombre: String, val edad: Int)

    val persona1 = Persona("Juan", 30)
    val persona2 = Persona("Juan", 30)

    /*Imprimie: Persona(nombre=Juan, edad=30)*/
    println(persona1)

    /*Imprimirá: true (compara valores)*/
    println(persona1 == persona2)


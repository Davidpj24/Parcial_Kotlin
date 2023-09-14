data class Persona(val nombre: String, val edad: Int)

fun esMayorDeEdad(persona: Persona?): Boolean {
    return persona?.edad ?: 0 >= 18
}

fun main() {
    val personas = listOf(
        Persona("Ana", 25),
        Persona("Carlos", 17),
        Persona("Elena", 30)
    )

    for (persona in personas) {
        if (esMayorDeEdad(persona)) {
            println("${persona.nombre} es mayor de edad")
        } else {
            println("${persona.nombre} es menor de edad")
        }
    }
}
/*
definie una función esMayorDeEdad() que verifica si una persona es mayor de edad (mayor o igual a 18 años)
y luego pasa a través de una lista de personas, aplicando la función y mostrando el resultado.
 */
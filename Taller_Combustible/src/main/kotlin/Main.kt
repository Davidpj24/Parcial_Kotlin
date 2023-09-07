class Auto(val color: String, val patente: String) {
    var combustible = 50.0
    val capacidadTanque = 50.0

    fun avanzar(distanciaMetros: Int) {
        val consumo = distanciaMetros / 10.0
        if (combustible >= consumo) {
            combustible -= consumo
            println("Avanzando $distanciaMetros metros. Combustible restante: $combustible L")
        } else {
            println("No hay suficiente combustible para avanzar.")
        }
    }

    fun retroceder(distanciaMetros: Int) {
        val consumo = distanciaMetros / 15.0
        if (combustible >= consumo) {
            combustible -= consumo
            println("Retrocediendo $distanciaMetros metros. Combustible restante: $combustible L")
        } else {
            println("No hay suficiente combustible para retroceder.")
        }
    }

    fun cargarCombustible(cantidadLitros: Double) {
        val espacioDisponible = capacidadTanque - combustible
        if (cantidadLitros <= espacioDisponible) {
            combustible += cantidadLitros
            println("Se cargaron $cantidadLitros L de combustible. Combustible total: $combustible L")
        } else {
            println("No se pueden cargar más de ${espacioDisponible} L de combustible.")
        }
    }
}

fun main() {
    val miAuto = Auto("Rojo", "ABC123")

    println("Auto creado - Color: ${miAuto.color}, Patente: ${miAuto.patente}")
    println("Combustible inicial: ${miAuto.combustible} L")

    var opcion: Int
    do {
        println("\nSelecciona una opción:")
        println("1. Avanzar")
        println("2. Retroceder")
        println("3. Cargar combustible")
        println("4. Terminar")

        opcion = readLine()?.toIntOrNull() ?: 0

        when (opcion) {
            1 -> {
                println("Ingresa la distancia a avanzar en metros:")
                val distancia = readLine()?.toIntOrNull() ?: 0
                miAuto.avanzar(distancia)
            }
            2 -> {
                println("Ingresa la distancia a retroceder en metros:")
                val distancia = readLine()?.toIntOrNull() ?: 0
                miAuto.retroceder(distancia)
            }
            3 -> {
                println("Ingresa la cantidad de litros a cargar:")
                val litros = readLine()?.toDoubleOrNull() ?: 0.0
                miAuto.cargarCombustible(litros)
            }
            4 -> println("Saliendo...")
            else -> println("Opción inválida. Por favor, elige una opción válida.")
        }
    } while (opcion != 4)
}

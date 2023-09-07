class Main() {
    fun main() {
        var edadJoven = 18
        var nivelSisben: Int
        var descuento: Int
        val precioLibreta: Double

        fun venderLibreta() {
            var precioLibreta == 350.000 && edadJoven >=18
            if (nivelSisben == 1) {
                (precioLibreta * 100) / 40
                println("El descuento aplicable es del 40%, su valor actual es: $precioLibreta %")
            } else if (nivelSisben == 2) {
                (precioLibreta * 100) / 30
                println("El descuento aplicable es del 30%, su valor actual es: $precioLibreta %")
            } else if (nivelSisben == 3) {
                (precioLibreta * 100) / 15
                println("El descuento aplicable es del 30%, su valor actual es: $precioLibreta %")
            } else if (nivelSisben > 3) {
                precioLibreta = precioLibreta
                println("El descuento aplicable es del 30%, su valor actual es: $precioLibreta %")
            }


        }

        fun venderLibreta2() {
            val precioLibreta = 200.000 && edadJoven == 18
            if (nivelSisben == 1) {
                descuento == 60
                (precioLibreta * 100) / 60
                println("El descuento aplicable es del 60%, su valor actual es: $precioLibreta %")
            } else if (nivelSisben == 2) {
                descuento == 40
                (precioLibreta * 100) / 40
                println("El descuento aplicable es del $descuento %, su valor actual es: $precioLibreta %")
            } else if (nivelSisben == 3) {
                descuento == 20
                (precioLibreta * 100) / 20
                println("El descuento aplicable es del $descuento %, su valor actual es: $precioLibreta %")
            } else if (nivelSisben > 3) {
                println("El nivel de su Sisben no permite descuento, su valor es de: $precioLibreta ")
            }
        }

        var opcion: Int
        do {
            println("\nSelecciona una opción:")
            println("1. Consultar descuento")
            println("2. Terminar")

            opcion = readLine()?.toIntOrNull() ?: 0

            when (opcion) {
                1 -> {
                    println("Ingrese su edad:")
                    var edadJoven = readLine()?.toIntOrNull() ?: 0
                    venderLibreta(edadJoven)
                }

                2 -> {
                    println("Ingresa tu nivel del Sisben:")
                    var nivelSisben = readLine()?.toIntOrNull() ?: 0
                    venderLibreta(nivelSisben)
                }

                3 -> println("Saliendo...")
                else -> println("Opción inválida. Por favor, elige una opción válida.")
            }
        } while (opcion != 3)
    }
}
/*
Edwin David Padilla Jimenez
Id:731217
Electiva CPII
 */

fun main() {


    /*Colores y sus valores correspondientes*/
    val colores = mapOf(
        "negro" to 0,
        "marrón" to 1,
        "rojo" to 2,
        "naranja" to 3,
        "amarillo" to 4,
        "verde" to 5,
        "azul" to 6,
        "violeta" to 7,
        "gris" to 8,
        "blanco" to 9
    )

    println("Ingrese el color de la primera banda:")
    val banda1 = readLine()!!.toLowerCase()
    println("Ingrese el color de la segunda banda:")
    val banda2 = readLine()!!.toLowerCase()
    println("Ingrese el color de la tercera banda (tolerancia):")
    val tolerancia = readLine()!!.toLowerCase()


    val valor = ((colores[banda1]!! * 10) + colores[banda2]!!) * Math.pow(10.0, colores[tolerancia]!!.toDouble())

    // Valor de la resistencia
    println("Código de colores: $banda1 $banda2 $tolerancia")
    println("Valor de la resistencia: $valor ohmios")
}

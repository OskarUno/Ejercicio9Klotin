package com.awakelab.oskar.ejercicio9

fun main() {
    println("Ingresar un Valor Numerico")
    val input = readLine()!!.toDouble()

    val fahrenheitToCelcius = (input - 32) * 5 / 9
    val kelvinToCelcius = input - 273.15
    val fahrenheitToKelvin = 5.0 / 9.0 * (input - 32.0) + 273.15
    val celciusToFahrenheit = (input * 1.8) + 32
    val celciusToKelvin = input + 273.15
    val kelvinToFahrenheit = (input - 273.15) * 9 / 5 + 32
    println("-----------------------------------------------------------------")
    println("$input °F equivalen a : $fahrenheitToCelcius °C  o  $fahrenheitToKelvin K")
    println("$input °C equivalen a : $celciusToFahrenheit °F  o  $celciusToKelvin K")
    println("$input  K equivalen a : $kelvinToFahrenheit °F  o  $kelvinToCelcius °C")
    println("-----------------------------------------------------------------")
}

fun isLetters(string: String): Boolean {
    return string.none { it !in 'A'..'Z' && it !in 'a'..'z' }
}
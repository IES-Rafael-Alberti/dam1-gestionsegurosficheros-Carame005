package src.utils

import java.time.LocalDate

object Utilidades {

     fun pedirNumero(msj : String) : Int{
         println(msj)
        return readln().toInt()
    }

     fun pedirString(msj : String) : String{
         println(msj)
        return readln()
    }

    fun obtenerDiferenciaAnio(anio : Int) : Int{
        val anioAntiguo = LocalDate.now().year
        return anio-anioAntiguo
    }

}
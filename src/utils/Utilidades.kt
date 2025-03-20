package src.utils

object Utilidades {

     fun pedirNumero(msj : String) : Int{
         println(msj)
        return readln().toInt()
    }

     fun pedirString(msj : String) : String{
         println(msj)
        return readln()
    }
}
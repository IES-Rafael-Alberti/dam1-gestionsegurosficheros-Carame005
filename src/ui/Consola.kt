package src.ui

class Consola : IEntradaSalida {
    override fun mostrar(msj: String, salto: Boolean, pausa: Boolean) {
        println(msj)
    }

    override fun mostrarError(msj: String, pausa: Boolean) {
        TODO("Not yet implemented")
    }

    override fun pedirInfo(msj: String): String {
        TODO("Not yet implemented")
    }

    override fun pedirInfo(
        msj: String,
        error: String,
        debeCumplir: (String) -> Boolean
    ): String {
        println(msj)
        var respuesta =  readln().toString()
        if (debeCumplir(respuesta)){
            return respuesta
        }
        else{
            println(error)
        }
        return respuesta
    }

    override fun pedirDouble(
        prompt: String,
        error: String,
        errorConv: String,
        debeCumplir: (Double) -> Boolean
    ): Double {
        return readln().toDouble()
    }

    override fun pedirEntero(
        prompt: String,
        error: String,
        errorConv: String,
        debeCumplir: (Int) -> Boolean
    ): Int {
        return readln().toInt()
    }

    override fun pedirInfoOculta(prompt: String): String {
        println(prompt)
    }

    override fun pausar(msj: String) {
        println(msj)
        readln()
    }

    override fun limpiarPantalla(numSaltos: Int) {
        repeat(numSaltos) { println() }
    }

    override fun preguntar(mensaje: String): Boolean {
        println(mensaje)
        return true
    }
}
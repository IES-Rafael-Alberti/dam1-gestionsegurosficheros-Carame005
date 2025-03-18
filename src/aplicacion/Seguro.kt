package src.aplicacion

abstract class Seguro(val numPoliza: Int, val dniTitular: String) {

    init{
        require(validarDni(dniTitular)){throw IllegalArgumentException("Ingrese un DNI válido") }
    }

    companion object {
        fun validarDni(dni: String): Boolean {
            return dni.matches(Regex("^[0-9]{8}[A-Z]$"))
        }
    }

    private val importe: Double = TODO()
    abstract fun calcularImporteAnioSiguiente(interes: Double): Double
    abstract fun tipoSeguro(): String
    abstract fun serializar(): String //Convierte el objeto a formato TXT
}
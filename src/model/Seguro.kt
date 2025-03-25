package src.model

abstract class Seguro(val numPoliza: Int, val dniTitular: String,private val importe: Double): IExportable {

    init{
        require(validarDni(dniTitular)){throw IllegalArgumentException("DNI inválido. Inténtelo nuevamente o escriba 'CANCELAR' para salir.")}
    }

    companion object {
        fun validarDni(dni: String): Boolean {
            return dni.matches(Regex("^[0-9]{8}[A-Z]$"))
        }
    }

    abstract fun calcularImporteAnioSiguiente(interes: Double): Double
    abstract fun tipoSeguro(): String
    abstract fun serializar(): String //Convierte el objeto a formato TXT

    fun obtenerImporte() = importe

    override fun serializar(separador: String): String {
        TODO("Not yet implemented")
    }

    override fun toString(): String {
        return super.toString()
    }

    override fun hashCode(): Int {
        return super.hashCode()
    }

    override fun equals(other: Any?): Boolean {
        return super.equals(other)
    }
}
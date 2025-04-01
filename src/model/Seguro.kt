package src.model

abstract class Seguro(public val numPoliza: Int, private val dniTitular: String,protected val importe: Double): IExportable {

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

    fun obtenerImporte() = importe

    override fun serializar(separador: String): String {
        return numPoliza.toString() + separador + dniTitular + separador + importe + separador
    }

    override fun toString(): String {
        return "${this::class.simpleName}(numPoliza= $numPoliza, dniTitular= $dniTitular, importe=$importe)"
    }

    override fun hashCode(): Int {
        return super.hashCode()
    }

    override fun equals(other: Any?): Boolean {
        return super.equals(other)
    }
}
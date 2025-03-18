package src.aplicacion

class SeguroVida(numPoliza: Int, dniTitular: String, val fechaNac: String, nivelRiesgo: Nivel, val indemnizacion: Double ) : Seguro(numPoliza,dniTitular) {

    init {
        require(numPoliza > 800000)
    }

    override fun calcularImporteAnioSiguiente(interes: Double): Double {
        TODO("Not yet implemented")
    }

    override fun tipoSeguro(): String {
        TODO("Not yet implemented")
    }

    override fun serializar(): String {
        TODO("Not yet implemented")
    }
}
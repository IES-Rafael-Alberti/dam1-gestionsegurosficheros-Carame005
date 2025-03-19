package src.aplicacion

class SeguroVida(numPoliza: Int, dniTitular: String, val fechaNac: String, val nivelRiesgo: Nivel, val indemnizacion: Double ) : Seguro(numPoliza,dniTitular) {

    init {
        require(numPoliza > 800000)
    }

    override fun calcularImporteAnioSiguiente(interes: Double): Double {
        var importeVida : Double = obtenerImporte()
        importeVida *= interes
        return importeVida
    }

    override fun tipoSeguro(): String {
        return "Seguro Vida"
    }

    override fun serializar(): String {
        return "$numPoliza,$dniTitular,${calcularImporteAnioSiguiente(0.0)},$fechaNac,$nivelRiesgo, $indemnizacion, ${tipoSeguro()}"
    }
}
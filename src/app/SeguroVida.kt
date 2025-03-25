package src.app

import src.model.Riesgo

class SeguroVida(numPoliza: Int, dniTitular: String, importe : Double, val fechaNac: String, val nivelRiesgo: Riesgo, val indemnizacion: Double ) : Seguro(numPoliza,dniTitular,importe) {

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
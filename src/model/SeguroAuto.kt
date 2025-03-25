package src.model

class SeguroAuto(numPoliza: Int, dniTitular: String,importe : Double,val descripcion: String, val combustible: String, val tipoAuto : Tipo, val tipoCobertura: String, val asistenciaCarretera: Boolean, val numPartes: Int) : Seguro(numPoliza,dniTitular,importe) {

    init {
        require(numPoliza > 400000)
    }

    override fun calcularImporteAnioSiguiente(interes: Double): Double {
        var importeAuto : Double = obtenerImporte()
        importeAuto *= interes
        return importeAuto
    }

    override fun tipoSeguro(): String {
        return "Seguro Auto"
    }

    override fun serializar(): String {
        return "$numPoliza;$dniTitular;${calcularImporteAnioSiguiente(0.0)};$descripcion;$combustible;$tipoAuto;$tipoCobertura;$asistenciaCarretera;$numPartes;${tipoSeguro()}"
    }
}
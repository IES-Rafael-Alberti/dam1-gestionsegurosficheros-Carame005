package src.model

class SeguroAuto(numPoliza: Int, dniTitular: String,importe : Double,val descripcion: String, val combustible: String, val tipoAuto : Auto, val tipoCobertura: String, val asistenciaCarretera: Boolean, val numPartes: Int) : Seguro(numPoliza,dniTitular,importe){

    init {
        require(numPoliza > 400000)
    }

    override fun calcularImporteAnioSiguiente(interes: Double): Double {
        var importeAuto : Double = obtenerImporte()
        importeAuto *= interes
        return importeAuto
    }

    override fun tipoSeguro(): String {
        return this::class.simpleName ?: "Desconocido"
    }

    override fun serializar(separador : String): String {
        return super.toString() + descripcion.toString() + separador + combustible + separador + tipoAuto + separador + tipoCobertura + separador + asistenciaCarretera + separador + numPartes + separador + tipoSeguro()
    }
}
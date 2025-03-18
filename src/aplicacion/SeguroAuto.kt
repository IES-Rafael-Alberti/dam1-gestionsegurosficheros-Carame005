package src.aplicacion

class SeguroAuto(numPoliza: Int, dniTitular: String,val descripcion: String, val combustible: String, val tipoAuto : Tipo, val tipoCobertura: String, val asistenciaCarretera: Boolean, val numPartes: Int) : Seguro(numPoliza,dniTitular) {

    init {
        require(numPoliza > 400000)
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
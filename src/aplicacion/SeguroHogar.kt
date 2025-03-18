package src.aplicacion

class SeguroHogar(numPoliza: Int, dniTitular: String, val metrosCuadrados: Int, val valorContenido: Double, val direccion: String) : Seguro(numPoliza,dniTitular) {
    init {
        require(numPoliza > 100000)
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
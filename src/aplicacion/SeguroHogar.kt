package src.aplicacion

class SeguroHogar(numPoliza: Int, dniTitular: String, val metrosCuadrados: Int, val valorContenido: Double, val direccion: String) : Seguro(numPoliza,dniTitular) {
    init {
        require(numPoliza > 100000)
    }

    override fun calcularImporteAnioSiguiente(interes: Double): Double {
        var importeHogar : Double = obtenerImporte()
        importeHogar *= interes
        return importeHogar
    }

    override fun tipoSeguro(): String {
        return "Seguro Hogar"
    }

    override fun serializar(): String {
        return "$numPoliza,$dniTitular,${calcularImporteAnioSiguiente(interes = 0.0)},$metrosCuadrados,$valorContenido,$direccion,${tipoSeguro()}"
    }
}
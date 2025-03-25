package src.model

class SeguroHogar(numPoliza: Int, dniTitular: String,importe : Double, val metrosCuadrados: Int, val valorContenido: Double, val direccion: String, val anioConstruccion : String) : Seguro(numPoliza,dniTitular,importe) {
    init {
        require(numPoliza > 100000)
    }

    override fun calcularImporteAnioSiguiente(interes: Double): Double {
        var importeHogar : Double = obtenerImporte()
        importeHogar *= interes
        return importeHogar
    }

    override fun tipoSeguro(): String {
        return this::class.simpleName ?: "Desconocido"
    }

    override fun serializar(separador : String): String {
        return super.toString() + separador + metrosCuadrados+ separador + separador + valorContenido + separador + direccion + separador + tipoSeguro()
    }
}
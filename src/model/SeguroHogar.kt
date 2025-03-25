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
        return "Seguro Hogar"
    }

    override fun serializar(): String {
        return "$numPoliza;$dniTitular;${calcularImporteAnioSiguiente(interes = 0.0)};$metrosCuadrados;$valorContenido;$direccion;${tipoSeguro()}"
    }
}
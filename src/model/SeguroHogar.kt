package src.model

class SeguroHogar : Seguro {
    var metrosCuadrados: Int = 0
    var valorContenido: Double = 0.0
    var direccion: String = ""
    var anioConstruccion : Int = 0

    companion object{
        private var numPolizasHogar : Int = 1000000
    }

    constructor(
        dniTitular: String,
        importe : Double,
        metrosCuadrados : Int,
        valorContenido : Double,
        direccion : String,
        anioConstruccion : Int
    ) : super(++numPolizasHogar,dniTitular,importe){
        this.metrosCuadrados = metrosCuadrados
        this.valorContenido = valorContenido
        this.direccion = direccion
        this.anioConstruccion = anioConstruccion
    }

    private constructor(
        numPoliza : Int,
        dniTitular: String,
        importe : Double,
        metrosCuadrados : Int,
        valorContenido : Double,
        direccion : String,
        anioConstruccion : Int
    ) : super(numPoliza,dniTitular,importe){
        this.metrosCuadrados = metrosCuadrados
        this.valorContenido = valorContenido
        this.direccion = direccion
        this.anioConstruccion = anioConstruccion
    }

    init {
        require(numPoliza > 100000)
    }

    override fun calcularImporteAnioSiguiente(interes: Double): Double {
        var importeHogar : Double = importe
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